package com.example.breakingbad

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.breakingbad.database.APIStatus
import com.example.breakingbad.database.BreakingBadApi
import com.example.breakingbad.database.CharacterModel
import com.example.breakingbad.util.Event
import com.example.breakingbad.viewmodel.MainViewModel
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import io.mockk.MockKAnnotations
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import java.lang.Exception

@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class MainViewModelTest {

    @Rule
    @JvmField
    var rule: TestRule = InstantTaskExecutorRule()

    @get:Rule
    val testCoroutineRule = TestCoroutineRule()

    @Rule
    @JvmField
    val instantExecutorRule: TestRule = InstantTaskExecutorRule()

    lateinit var viewModel: MainViewModel


    val apiService: BreakingBadApi = mock<BreakingBadApi>()

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        viewModel = MainViewModel(apiService)
    }

    @Test
    fun `when successfully fetch the data from the api, then it should update the value of the status to done`(){
        runBlockingTest {

            whenever(apiService.getCharacters()).thenAnswer { mutableListOf<CharacterModel>() }

            viewModel.getBreakingBadCharacters()

            assertEquals(viewModel.status.value, APIStatus.DONE)
            assertEquals(viewModel.charItems.value is List, true)
        }
    }

    @Test
    fun `when unable to fetch the data from the api, then it should update the value of the status to error`(){
        runBlockingTest {

            whenever(apiService.getCharacters()).thenAnswer { throw Exception("error") }

            viewModel.getBreakingBadCharacters()

            assertEquals(viewModel.status.value, APIStatus.ERROR)
            assertEquals(viewModel.charItems.value is List, true)
        }
    }

    @Test
    fun `on user selects item, it should trigger the event`(){
        val item = mockk<CharacterModel>()
        viewModel.userSelectsItem(item)
        val event = viewModel.navigateToDetails.value
        val selectedItem = viewModel.selectedCharItem.value
        assertEquals(event is Event, true)
        assertEquals(selectedItem, item)
    }

    @Test
    fun `when unable to find any result then it should emit empty array`(){
        runBlockingTest {
            whenever(viewModel.charItems.value).thenReturn(mutableListOf())

            viewModel.filterByNames("nice")

            assertEquals(viewModel.charFiltered.value?.isEmpty(), true)
        }
    }

}