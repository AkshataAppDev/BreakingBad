package com.example.breakingbad.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010 \u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020\u001cJ\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!J\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012\u00a8\u0006&"}, d2 = {"Lcom/example/breakingbad/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "apiService", "Lcom/example/breakingbad/database/BreakingBadApi;", "(Lcom/example/breakingbad/database/BreakingBadApi;)V", "_charFiltered", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/breakingbad/database/CharacterModel;", "_charItems", "_navigateToDetails", "Lcom/example/breakingbad/util/Event;", "_selectedCharItem", "_status", "Lcom/example/breakingbad/database/APIStatus;", "charFiltered", "Landroidx/lifecycle/LiveData;", "getCharFiltered", "()Landroidx/lifecycle/LiveData;", "charItems", "getCharItems", "navigateToDetails", "getNavigateToDetails", "selectedCharItem", "getSelectedCharItem", "status", "getStatus", "filterByNames", "", "name", "", "filterBySeason", "season", "", "getBreakingBadCharacters", "onSeasonFilterClicked", "userSelectsItem", "item", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.breakingbad.database.CharacterModel>> _charItems = null;
    private final androidx.lifecycle.MutableLiveData<com.example.breakingbad.database.APIStatus> _status = null;
    private final androidx.lifecycle.MutableLiveData<com.example.breakingbad.database.CharacterModel> _selectedCharItem = null;
    private final androidx.lifecycle.MutableLiveData<com.example.breakingbad.util.Event<com.example.breakingbad.database.CharacterModel>> _navigateToDetails = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.breakingbad.database.CharacterModel>> _charFiltered = null;
    private final com.example.breakingbad.database.BreakingBadApi apiService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.breakingbad.database.CharacterModel>> getCharItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.breakingbad.database.APIStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.breakingbad.database.CharacterModel> getSelectedCharItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.breakingbad.util.Event<com.example.breakingbad.database.CharacterModel>> getNavigateToDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.breakingbad.database.CharacterModel>> getCharFiltered() {
        return null;
    }
    
    public final void getBreakingBadCharacters() {
    }
    
    public final void userSelectsItem(@org.jetbrains.annotations.NotNull()
    com.example.breakingbad.database.CharacterModel item) {
    }
    
    public final void filterByNames(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void onSeasonFilterClicked(int season) {
    }
    
    private final java.util.List<com.example.breakingbad.database.CharacterModel> filterBySeason(int season) {
        return null;
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.breakingbad.database.BreakingBadApi apiService) {
        super();
    }
}