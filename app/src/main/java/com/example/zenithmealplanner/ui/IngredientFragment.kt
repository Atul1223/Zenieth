package com.example.zenithmealplanner.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.zenithmealplanner.databinding.FragmentIngredientBinding
import com.example.zenithmealplanner.ui.adapters.IngredientItemsAdapter
import com.example.zenithmealplanner.viewModel.NavigationViewModel

class IngredientFragment : Fragment() {

    companion object {
        fun getInstance(): Fragment{
            return IngredientFragment()
        }
    }

    private lateinit var binding: FragmentIngredientBinding
    private lateinit var adapter: IngredientItemsAdapter
    private val navigationViewModel: NavigationViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIngredientBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()

        initListener()

        initObservers()
    }

    private fun initViews() {
        adapter = IngredientItemsAdapter()
        binding.rvIngredientsItem.adapter = adapter
        binding.rvIngredientsItem.layoutManager = GridLayoutManager(context,3)
    }

    private fun initObservers() {
    }

    private fun initListener() {
        binding.btnStartCooking.setOnClickListener {
            navigationViewModel.showSearchIngredientFragment()
        }
    }
}