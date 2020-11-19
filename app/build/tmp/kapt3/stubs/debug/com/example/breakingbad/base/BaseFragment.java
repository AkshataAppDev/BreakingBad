package com.example.breakingbad.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/example/breakingbad/base/BaseFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "mainViewModel", "Lcom/example/breakingbad/viewmodel/MainViewModel;", "getMainViewModel", "()Lcom/example/breakingbad/viewmodel/MainViewModel;", "setMainViewModel", "(Lcom/example/breakingbad/viewmodel/MainViewModel;)V", "providerFactory", "Lcom/example/breakingbad/di/ViewModelProviderFactory;", "getProviderFactory", "()Lcom/example/breakingbad/di/ViewModelProviderFactory;", "setProviderFactory", "(Lcom/example/breakingbad/di/ViewModelProviderFactory;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class BaseFragment extends dagger.android.support.DaggerFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.breakingbad.di.ViewModelProviderFactory providerFactory;
    @org.jetbrains.annotations.NotNull()
    public com.example.breakingbad.viewmodel.MainViewModel mainViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.breakingbad.di.ViewModelProviderFactory getProviderFactory() {
        return null;
    }
    
    public final void setProviderFactory(@org.jetbrains.annotations.NotNull()
    com.example.breakingbad.di.ViewModelProviderFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.breakingbad.viewmodel.MainViewModel getMainViewModel() {
        return null;
    }
    
    public final void setMainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.breakingbad.viewmodel.MainViewModel p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public BaseFragment() {
        super();
    }
}