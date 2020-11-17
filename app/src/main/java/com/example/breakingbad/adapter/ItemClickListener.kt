package com.example.breakingbad.adapter

import com.example.breakingbad.database.CharacterModel

class ItemClickListener(val clickListener: (charItem: CharacterModel) -> Unit) {
    fun onClick(charItem: CharacterModel) = clickListener(charItem)
}