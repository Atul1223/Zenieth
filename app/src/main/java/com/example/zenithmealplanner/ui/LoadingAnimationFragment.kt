package com.example.zenithmealplanner.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zenithmealplanner.R

class LoadingAnimationFragment : Fragment() {
    companion object {
        fun getInstance(): Fragment{
            return LoadingAnimationFragment()
        }
    }

    private lateinit var view: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = layoutInflater.inflate(R.layout.fragment_loading_animation,container,false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListener()

        initObservers()
    }

    private fun initObservers() {

    }

    private fun initListener() {
    }
}