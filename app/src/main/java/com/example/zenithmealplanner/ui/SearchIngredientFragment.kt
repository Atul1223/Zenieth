package com.example.zenithmealplanner.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zenithmealplanner.R
import com.example.zenithmealplanner.ui.adapters.IngredientSearchItemsAdapter

class SearchIngredientFragment : Fragment() {

    companion object {
        fun getInstance(): Fragment{
            return SearchIngredientFragment()
        }
    }

    private lateinit var view: View
    private lateinit var adapter: IngredientSearchItemsAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = layoutInflater.inflate(R.layout.fragment_search_ingredient,container,false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()

        initRecyclerView()

        initListener()

        initObservers()
    }

    private fun initRecyclerView() {
        adapter = IngredientSearchItemsAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(context,5)
    }

    private fun initViews() {
        recyclerView = view.findViewById(R.id.rv_search_ingredient)
    }

    private fun initObservers() {

    }

    private fun initListener() {

    }
}