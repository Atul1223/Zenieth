package com.example.zenithmealplanner.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.zenithmealplanner.R
import com.example.zenithmealplanner.databinding.FragmentChooseMealBinding
import com.example.zenithmealplanner.databinding.FragmentIngredientBinding
import com.example.zenithmealplanner.ui.adapters.IngredientItemsAdapter

class ChooseMealFragment : Fragment() {

    companion object {
        fun getInstance(): Fragment{
            return ChooseMealFragment()
        }
    }

    private lateinit var binding: FragmentChooseMealBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChooseMealBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListener()

        initObservers()
    }

    private fun initObservers() {

    }

    private fun initListener() {
        binding.btnPrepareMeal.setOnClickListener {

        }
    }

}