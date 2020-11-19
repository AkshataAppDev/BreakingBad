package com.example.breakingbad.di.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/breakingbad/di/main/MainFragmentBuildersModule;", "", "()V", "contributeCharDetailFragment", "Lcom/example/breakingbad/ui/CharacterDetailFragment;", "contributeCharListFragment", "Lcom/example/breakingbad/ui/CharacterListFragment;", "app_debug"})
@dagger.Module()
public abstract class MainFragmentBuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.breakingbad.ui.CharacterListFragment contributeCharListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.breakingbad.ui.CharacterDetailFragment contributeCharDetailFragment();
    
    public MainFragmentBuildersModule() {
        super();
    }
}