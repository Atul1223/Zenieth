package com.example.zenithmealplanner.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.viewbinding.ViewBinding
import com.example.zenithmealplanner.R
import com.example.zenithmealplanner.databinding.ActivityZenithHomeBinding
import com.example.zenithmealplanner.viewModel.NavigationViewModel

class ZenithHomeActivity : AppCompatActivity() {

    private lateinit var binding: ViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityZenithHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showFragment(SearchIngredientFragment.getInstance())
    }

    fun showFragment(fragment: Fragment, addToBackStack: Boolean = true) {
        supportFragmentManager.commit {
            replace(R.id.container_fragment_home, fragment)
            if(addToBackStack){
                addToBackStack(fragment::class.simpleName)
            }
        }
    }
}