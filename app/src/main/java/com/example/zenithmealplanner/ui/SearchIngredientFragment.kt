package com.example.zenithmealplanner.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.zenithmealplanner.R
import com.example.zenithmealplanner.databinding.FragmentIngredientBinding
import com.example.zenithmealplanner.databinding.FragmentSearchIngredientBinding
import com.example.zenithmealplanner.ui.adapters.IngredientItemsAdapter
import com.example.zenithmealplanner.ui.adapters.IngredientSearchItemsAdapter

class SearchIngredientFragment : Fragment() {

    companion object {
        fun getInstance(): Fragment{
            return SearchIngredientFragment()
        }
    }

    private lateinit var binding: FragmentSearchIngredientBinding
    private lateinit var adapter: IngredientSearchItemsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchIngredientBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()

        initListener()

        initObservers()
    }

    private fun initViews() {
        adapter = IngredientSearchItemsAdapter()
        binding.rvSearchIngredient.adapter = adapter
        binding.rvSearchIngredient.layoutManager = GridLayoutManager(context,5)
    }

    private fun initObservers() {

    }

    private fun initListener() {

    }
}