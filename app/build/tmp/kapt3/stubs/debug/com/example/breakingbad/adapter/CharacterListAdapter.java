package com.example.breakingbad.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/example/breakingbad/adapter/CharacterListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/breakingbad/database/CharacterModel;", "Lcom/example/breakingbad/adapter/CharacterListAdapter$ItemViewHolder;", "clickListener", "Lcom/example/breakingbad/adapter/ItemClickListener;", "(Lcom/example/breakingbad/adapter/ItemClickListener;)V", "getClickListener", "()Lcom/example/breakingbad/adapter/ItemClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "ItemViewHolder", "app_debug"})
public final class CharacterListAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.breakingbad.database.CharacterModel, com.example.breakingbad.adapter.CharacterListAdapter.ItemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.breakingbad.adapter.ItemClickListener clickListener = null;
    public static final com.example.breakingbad.adapter.CharacterListAdapter.DiffCallback DiffCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.breakingbad.adapter.CharacterListAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.breakingbad.adapter.CharacterListAdapter.ItemViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.breakingbad.adapter.ItemClickListener getClickListener() {
        return null;
    }
    
    public CharacterListAdapter(@org.jetbrains.annotations.NotNull()
    com.example.breakingbad.adapter.ItemClickListener clickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/breakingbad/adapter/CharacterListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/breakingbad/databinding/ItemCharacterBinding;", "(Lcom/example/breakingbad/databinding/ItemCharacterBinding;)V", "bind", "", "charItem", "Lcom/example/breakingbad/database/CharacterModel;", "clickListener", "Lcom/example/breakingbad/adapter/ItemClickListener;", "app_debug"})
    public static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.example.breakingbad.databinding.ItemCharacterBinding binding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.breakingbad.database.CharacterModel charItem, @org.jetbrains.annotations.NotNull()
        com.example.breakingbad.adapter.ItemClickListener clickListener) {
        }
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.breakingbad.databinding.ItemCharacterBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/breakingbad/adapter/CharacterListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/breakingbad/database/CharacterModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.breakingbad.database.CharacterModel> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.breakingbad.database.CharacterModel oldItem, @org.jetbrains.annotations.NotNull()
        com.example.breakingbad.database.CharacterModel newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.breakingbad.database.CharacterModel oldItem, @org.jetbrains.annotations.NotNull()
        com.example.breakingbad.database.CharacterModel newItem) {
            return false;
        }
        
        private DiffCallback() {
            super();
        }
    }
}