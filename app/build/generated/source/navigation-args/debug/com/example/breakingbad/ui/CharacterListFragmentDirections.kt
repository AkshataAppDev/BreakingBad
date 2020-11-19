package com.example.breakingbad.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.breakingbad.R

class CharacterListFragmentDirections private constructor() {
  companion object {
    fun actionCharListFragmentToCharDetailFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_charListFragment_to_charDetailFragment)
  }
}
