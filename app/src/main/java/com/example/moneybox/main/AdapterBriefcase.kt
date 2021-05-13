package com.example.moneybox.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.anychart.AnyChart
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry
import com.anychart.charts.Pie
import com.example.moneybox.R
import com.example.moneybox.feature.charts.PieFragment
import kotlinx.android.synthetic.main.item_briefcase.view.*
import kotlinx.android.synthetic.main.item_briefcase.*

class AdapterBriefcase: RecyclerView.Adapter<AdapterBriefcase.ViewHolder>() {

    private val kategori = arrayOf(
        "Сырьевая промышленность",
        "Электроэнергетика",
        "Энергетика",
        "Телекоммуникации",
        "Машиностроение и транспорт",
        "Потребительские товары"
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_briefcase, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text.text = kategori[position]
    }

    override fun getItemCount(): Int {
        return kategori.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var text: TextView

        init {
            text = itemView.findViewById(R.id.text)

        }


    }
}