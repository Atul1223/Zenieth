package com.example.zenithmealplanner.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zenithmealplanner.R
import com.example.zenithmealplanner.ui.adapters.IngredientItemsAdapter
import com.example.zenithmealplanner.viewModel.NavigationViewModel

class IngredientFragment : Fragment() {

    companion object {
        fun getInstance(): Fragment{
            return IngredientFragment()
        }
    }

    private lateinit var view: View
    private lateinit var recyclerView: RecyclerView
    private lateinit var startCookingButton: TextView
    private lateinit var adapter: IngredientItemsAdapter
    private val navigationViewModel: NavigationViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = layoutInflater.inflate(R.layout.fragment_ingredient,container,false)
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
        adapter = IngredientItemsAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(context,3)
    }

    private fun initViews() {
        recyclerView = view.findViewById(R.id.rv_ingredients_item)
        startCookingButton = view.findViewById(R.id.btn_start_cooking)
    }

    private fun initObservers() {
    }

    private fun initListener() {
        startCookingButton.setOnClickListener {
            navigationViewModel.showSearchIngredientFragment()
        }
    }
}