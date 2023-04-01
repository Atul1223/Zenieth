package com.example.zenithmealplanner.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zenithmealplanner.R
import com.example.zenithmealplanner.databinding.FragmentChooseMealBinding
import com.example.zenithmealplanner.databinding.FragmentLoadingAnimationBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class LoadingAnimationFragment : Fragment() {
    companion object {
        fun getInstance(): Fragment{
            return LoadingAnimationFragment()
        }
    }

    private lateinit var binding: FragmentLoadingAnimationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoadingAnimationBinding.inflate(layoutInflater)
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
    }
}