package com.example.breakingbad.di

import com.example.breakingbad.di.main.MainFragmentBuildersModule
import com.example.breakingbad.di.main.MainModule
import com.example.breakingbad.di.main.MainScope
import com.example.breakingbad.di.main.MainViewModelModule
import com.example.breakingbad.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @MainScope
    @ContributesAndroidInjector(
        modules = [MainModule::class, MainFragmentBuildersModule::class, MainViewModelModule::class]
    )
    abstract fun contributeMainActivity(): MainActivity
}