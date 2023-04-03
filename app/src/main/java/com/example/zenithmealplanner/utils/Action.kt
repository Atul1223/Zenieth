package com.example.zenithmealplanner.utils

class Action(private var mAction: Int) {

    companion object {
        const val SHOW_INGREDIENT_FRAGMENT = 1
        const val HIDE_INGREDIENT_FRAGMENT = 2

        const val SHOW_SEARCH_INGREDIENT_FRAGMENT = 3
        const val HIDE_SEARCH_INGREDIENT_FRAGMENT = 4

        const val SHOW_CHOOSE_MEAL_FRAGMENT = 5
        const val HIDE_CHOOSE_MEAL_FRAGMENT = 6

        const val SHOW_LOADING_FRAGMENT = 7
        const val HIDE_LOADING_FRAGMENT = 8
    }

    fun getValue() : Int {
        return mAction
    }
}