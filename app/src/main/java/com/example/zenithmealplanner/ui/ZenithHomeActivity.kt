package com.example.zenithmealplanner.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.example.zenithmealplanner.R
import com.example.zenithmealplanner.ZenithMealPlanner
import com.example.zenithmealplanner.databinding.ActivityZenithHomeBinding
import com.example.zenithmealplanner.utils.Action
import com.example.zenithmealplanner.utils.Action.Companion.SHOW_INGREDIENT_FRAGMENT
import com.example.zenithmealplanner.utils.Action.Companion.SHOW_SEARCH_INGREDIENT_FRAGMENT
import com.example.zenithmealplanner.viewModel.NavigationViewModel

class ZenithHomeActivity : AppCompatActivity() {

    private lateinit var binding: ViewBinding
    private lateinit var navigationViewModel: NavigationViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityZenithHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navigationViewModel = ViewModelProvider(this).get(NavigationViewModel::class.java)
        showFragment(IngredientFragment.getInstance())

        initObservers()
    }

    private fun initObservers() {
        navigationViewModel.getAction().observe(this){
            it?.let {
                navToScreens(it)
                Log.d(
                    "nav","here"
                )
            }
        }
    }

    private fun navToScreens(action: Action) {
        when(action.getValue()) {
            SHOW_INGREDIENT_FRAGMENT -> {
                showFragment(
                    IngredientFragment.getInstance(),
                )
            }

            SHOW_SEARCH_INGREDIENT_FRAGMENT -> {
                showFragment(
                    SearchIngredientFragment.getInstance(),
                    false
                )
                Log.d("nav","search")
            }

            Action.HIDE_SEARCH_INGREDIENT_FRAGMENT -> {
                hideFragment(
                    SearchIngredientFragment.getInstance(),
                )
            }
        }
    }
    private fun showFragment(fragment: Fragment, addToBackStack: Boolean = true) {
        supportFragmentManager.commit {
            replace(R.id.container_fragment_home, fragment, fragment::class.simpleName)
            if(addToBackStack){
                addToBackStack(fragment::class.simpleName)
            }
        }
    }

    private fun hideFragment(fragment: Fragment) {
        supportFragmentManager.commit {
            remove(fragment)
        }
    }
}