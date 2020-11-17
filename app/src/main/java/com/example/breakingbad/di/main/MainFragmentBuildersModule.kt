package com.example.breakingbad.di.main

import com.example.breakingbad.ui.CharacterDetailFragment
import com.example.breakingbad.ui.CharacterListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeCharListFragment(): CharacterListFragment

    @ContributesAndroidInjector
    abstract fun contributeCharDetailFragment(): CharacterDetailFragment
}