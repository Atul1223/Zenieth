package com.example.zenithmealplanner.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.zenithmealplanner.R

class ChooseMealFragment : Fragment() {

    companion object {
        fun getInstance(): Fragment{
            return ChooseMealFragment()
        }
    }

    private lateinit var view: View
    private lateinit var prepareMealButton: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = layoutInflater.inflate(R.layout.fragment_choose_meal,container,false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()

        initListener()

        initObservers()
    }

    private fun initViews() {
        prepareMealButton = view.findViewById(R.id.btn_prepare_meal)
    }

    private fun initObservers() {

    }

    private fun initListener() {
        prepareMealButton.setOnClickListener {

        }
    }

}