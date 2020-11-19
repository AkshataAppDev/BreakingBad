package com.example.breakingbad.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.breakingbad.util.Event
import com.example.breakingbad.database.APIStatus
import com.example.breakingbad.database.BreakingBadApi
import com.example.breakingbad.database.CharacterModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MainViewModel @Inject constructor(private val apiService: BreakingBadApi) :
    ViewModel() {

    private val _charItems = MutableLiveData<List<CharacterModel>>()
    val charItems: LiveData<List<CharacterModel>>
        get() = _charItems

    private val _status = MutableLiveData<APIStatus>()
    val status: LiveData<APIStatus>
        get() = _status

    private val _selectedCharItem = MutableLiveData<CharacterModel>()
    val selectedCharItem: LiveData<CharacterModel>
        get() = _selectedCharItem

    private val _navigateToDetails = MutableLiveData<Event<CharacterModel>>()
    val navigateToDetails: LiveData<Event<CharacterModel>>
        get() = _navigateToDetails

    private val _charFiltered = MutableLiveData<List<CharacterModel>>()
    val charFiltered: LiveData<List<CharacterModel>>
        get() = _charFiltered

    init {

        getBreakingBadCharacters()
    }

    fun getBreakingBadCharacters() {
        viewModelScope.launch {
            try {
                _status.value = APIStatus.LOADING
                val apiResponse = apiService.getCharacters()

                _charItems.value = apiResponse
                _status.value = APIStatus.DONE
            } catch (e: Exception) {
                _status.value = APIStatus.ERROR
                _charItems.value = ArrayList()
            }
        }

    }

    fun userSelectsItem(item: CharacterModel) {
        _navigateToDetails.value =
            Event(item) // Trigger the event by setting a new Event as a new value
        _selectedCharItem.value = item
    }

    fun filterByNames(name: String) {
        val results = charItems.value?.filter { character ->
            character.name.contains(name, true)
        }
        if (!results.isNullOrEmpty()) {
            _charFiltered.postValue(results)
        }
        else
        {
            _charFiltered.postValue(ArrayList())
        }
    }
    fun onSeasonFilterClicked(season: Int) {
        if (season == 0) {
            _charFiltered.postValue(charItems.value)
        } else {
            val results = filterBySeason(season)
            if (results.isNotEmpty()) {
                _charFiltered.postValue(results)
            }
            else {
                _charFiltered.postValue(ArrayList())
            }
        }
    }
    private fun filterBySeason(season: Int): List<CharacterModel> {
        val filtered: MutableList<CharacterModel> = mutableListOf()
        for (charc in charItems.value!!) {
            if(!charc.appearance.isNullOrEmpty()) {
                if (charc.appearance.contains(season)) {
                    filtered.add(charc)
                }
            }
        }
        return filtered.toList()
    }
}