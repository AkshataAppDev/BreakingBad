package com.example.breakingbad.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.breakingbad.R

class CharacterDetailFragmentDirections private constructor() {
  companion object {
    fun actionCharDetailFragmentToCharListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_charDetailFragment_to_charListFragment)
  }
}
