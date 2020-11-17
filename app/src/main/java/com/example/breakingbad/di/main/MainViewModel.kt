package com.example.breakingbad.di.main

import androidx.lifecycle.ViewModel
import com.example.breakingbad.di.ViewModelKey
import com.example.breakingbad.viewmodel.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel
}