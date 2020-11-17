package com.example.breakingbad.ui

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.breakingbad.R
import com.example.breakingbad.adapter.CharacterListAdapter
import com.example.breakingbad.adapter.ItemClickListener
import com.example.breakingbad.base.BaseFragment
import com.example.breakingbad.databinding.CharListBinding

class CharacterListFragment : BaseFragment(), SearchView.OnQueryTextListener
{
    private val TAG = "CharacterListFragment"

    private lateinit var binding: CharListBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewModel = mainViewModel
        binding.characterSearch.setOnQueryTextListener(this)

        mainViewModel.navigateToDetails.observe(this, Observer {
            it.getContentIfNotHandled()?.let {
                findNavController().navigate(R.id.action_charListFragment_to_charDetailFragment,null)
            }
        })

        mainViewModel.charFiltered.observe(this, Observer {
            val adapter = binding.charRecyclerView.adapter as CharacterListAdapter
            if(it != null) {
                adapter.submitList(it)
            }
        })
    }

//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        inflater.inflate(R.menu.main_menu,menu)
//        super.onCreateOptionsMenu(menu, inflater)
//    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val season = when(item.itemId) {
            R.id.filter1 -> 1
            R.id.filter2 -> 2
            R.id.filter3 -> 3
            R.id.filter4 -> 4
            R.id.filter5 -> 5
            else -> 0
        }
        mainViewModel.onSeasonFilterClicked(season)
        return super.onOptionsItemSelected(item)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = CharListBinding.inflate(inflater)

        binding.lifecycleOwner = this

        binding.charRecyclerView.adapter =
            CharacterListAdapter(
                ItemClickListener { charItem ->
                    Log.d(TAG, "onCreateView: " + charItem.name)
                    mainViewModel.userSelectsItem(charItem)

                })

        return binding.root
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        mainViewModel.filterByNames(query?:"")
        return true
    }

    override fun onQueryTextChange(query: String?): Boolean {
        mainViewModel.filterByNames(query?:"")
        return true
    }
}