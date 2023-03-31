package com.example.zenithmealplanner.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.zenithmealplanner.R

class IngredientItemsAdapter: RecyclerView.Adapter<IngredientItemsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): IngredientItemsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_ingredient_card,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: IngredientItemsAdapter.ViewHolder, position: Int) {

    }


    override fun getItemCount(): Int {
        return 10
    }

    public class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }
}