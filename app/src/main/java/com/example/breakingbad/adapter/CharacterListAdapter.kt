package com.example.breakingbad.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.breakingbad.database.CharacterModel
import com.example.breakingbad.databinding.ItemCharacterBinding

class CharacterListAdapter(val clickListener: ItemClickListener) :
    ListAdapter<CharacterModel, CharacterListAdapter.ItemViewHolder>(
        DiffCallback
    ) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ItemCharacterBinding.inflate(LayoutInflater.from(parent.context))
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val charItem = getItem(position)
        holder.bind(charItem, clickListener)
    }

    class ItemViewHolder(private var binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(
            charItem: CharacterModel,
            clickListener: ItemClickListener
        ) {
            binding.charItem = charItem
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }
    }

    //Use of DiffUtil to manage differences in the old and new list when data changes
    companion object DiffCallback : DiffUtil.ItemCallback<CharacterModel>() {
        override fun areItemsTheSame(oldItem: CharacterModel, newItem: CharacterModel): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: CharacterModel, newItem: CharacterModel): Boolean {
            return oldItem.name == newItem.name
        }
    }
}