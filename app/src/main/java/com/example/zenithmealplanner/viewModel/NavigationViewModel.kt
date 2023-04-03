package com.example.zenithmealplanner.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.zenithmealplanner.utils.Action

class NavigationViewModel: ViewModel() {

    private val mAction = MutableLiveData<Action>()

    fun getAction(): LiveData<Action> = mAction

    fun showIngredientFragment() {
        mAction.postValue(Action(Action.SHOW_INGREDIENT_FRAGMENT))
    }

    fun hideIngredientFragment() {
        mAction.postValue(Action(Action.HIDE_INGREDIENT_FRAGMENT))
    }

    fun showSearchIngredientFragment() {
        mAction.postValue(Action(Action.SHOW_SEARCH_INGREDIENT_FRAGMENT))
    }

    fun hideSearchIngredientFragment() {
        mAction.postValue(Action(Action.HIDE_SEARCH_INGREDIENT_FRAGMENT))
    }

    fun showChooseMealFragment() {
        mAction.postValue(Action(Action.SHOW_CHOOSE_MEAL_FRAGMENT))
    }

    fun hideChooseMealFragment() {
        mAction.postValue(Action(Action.HIDE_CHOOSE_MEAL_FRAGMENT))
    }

    fun showLoadingAnimationFragment() {
        mAction.postValue(Action(Action.SHOW_LOADING_FRAGMENT))
    }

    fun hideLoadingAnimationFragment() {
        mAction.postValue(Action(Action.HIDE_LOADING_FRAGMENT))
    }
}