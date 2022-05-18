package com.odinn.excahngerates.screens.favorite

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.odinn.excahngerates.R
import com.odinn.excahngerates.model.USD
import com.odinn.excahngerates.model.Valute

class FavoriteAdapter: RecyclerView.Adapter<FavoriteAdapter.StartViewHolder>() {
    var listFirst = emptyList<USD>()

    class StartViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout,parent,false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        with(holder.itemView){
            //item_count.text = listFirst[position].Nominal.toString()
            //item_curr_name.text = "(${listFirst[position].CharCode}) ${listFirst[position].Name}"
            //item_value.text = listFirst[position].Value.toString()
            //item_delta.text = "(${listFirst[position].Value - listFirst[position].Previous})"
        }
    }

    override fun getItemCount(): Int = listFirst.size

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: Valute){
        listFirst = listOf(list.USD)
        notifyDataSetChanged()
    }
}