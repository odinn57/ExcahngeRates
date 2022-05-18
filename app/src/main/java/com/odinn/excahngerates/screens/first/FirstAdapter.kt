package com.odinn.excahngerates.screens.first

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.odinn.excahngerates.R
import com.odinn.excahngerates.model.*
import kotlinx.android.synthetic.main.item_money_layout.view.*

class FirstAdapter:RecyclerView.Adapter<FirstAdapter.StartViewHolder>() {
    var listFirst = emptyList<ItemCurr>()

    class StartViewHolder(view:View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout,parent,false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        with(holder.itemView){
            item_count.text = listFirst[position].Nominal.toString()
            item_curr_name.text = "(${listFirst[position].CharCode}) ${listFirst[position].Name}"
            item_value.text = listFirst[position].Value.toString()
            val delta = listFirst[position].Value - listFirst[position].Previous
            item_delta.text = String.format("%.3f", delta)
        }
    }

    override fun getItemCount(): Int = listFirst.size

    @SuppressLint("NotifyDataSetChanged")
    fun setList(valute: Valute){

        listFirst = listOf(
            ItemCurr(CharCode = valute.USD.CharCode,
            ID = valute.USD.ID,
            Name = valute.USD.Name,
            Nominal = valute.USD.Nominal,
            NumCode = valute.USD.NumCode,
            Previous = valute.USD.Previous,
            Value = valute.USD.Value),
            ItemCurr(CharCode = valute.BYN.CharCode,
                ID = valute.BYN.ID,
                Name = valute.BYN.Name,
                Nominal = valute.BYN.Nominal,
                NumCode = valute.BYN.NumCode,
                Previous = valute.BYN.Previous,
                Value = valute.BYN.Value)
        )
        notifyDataSetChanged()
    }


}