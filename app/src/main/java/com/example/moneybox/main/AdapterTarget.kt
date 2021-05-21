package com.example.moneybox.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.moneybox.R
import kotlinx.android.synthetic.main.item_day_include.view.*

class AdapterTarget: RecyclerView.Adapter<AdapterTarget.ViewHolder>()  {

    private val targetList = arrayOf(
        "На отдых",
        "На машину",
        "На дачу",
        "На квартиру"
    )

    private val dateList = arrayOf(
        "04.12.2025",
        "03.05.2021",
        "31.10.2023",
        "17.01.2026"
    )

    private val percentTarget = arrayOf(
        12,54,65,45
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterTarget.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_day, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTarget.text = targetList[position]
        holder.dateList.text = dateList[position]
        holder.percentTarget.progress = percentTarget[position]
        holder.bind()
    }

    override fun getItemCount(): Int {
        return targetList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var nameTarget: TextView = itemView.findViewById(R.id.name_target)
        var dateList: TextView = itemView.findViewById(R.id.date_target)
        var percentTarget: ProgressBar = itemView.findViewById(R.id.progressBar)

        fun bind(){
            itemView.btn_target.setOnClickListener {
                it.findNavController().navigate(R.id.action_main_dest_to_placeholder_target)
            }
        }

    }
}