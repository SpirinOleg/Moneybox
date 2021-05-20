package com.example.moneybox.feature.briefcase

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moneybox.R
import com.example.moneybox.model.Recomendation
import kotlinx.android.synthetic.main.item_shares_briefcase.view.*
import java.text.MessageFormat

class AdapterSettingsBriefcase: RecyclerView.Adapter<AdapterSettingsBriefcase.ViewHolder>() {

    var recomendation: List<Recomendation> = listOf(
            Recomendation("#F70512",30,"Акции"),
            Recomendation("#3A83F1",40,"Облигации"),
            Recomendation("#8BD5FF",20,"Валюта"),
            Recomendation("#F99F36",10,"Золото")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_shares_briefcase, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(recomendation[position])
    }

    override fun getItemCount(): Int {
        return recomendation.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val messagePattern = "{0}{1}"
        private val percent = itemView.context.getString(R.string.percent_shares)

        fun bind(item: Recomendation)= with(itemView){
            shares_color_briefcase.setBackgroundColor(Color.parseColor(item.colorShares))
            shares_percent_briefcase.text = MessageFormat.format(messagePattern, item.percentShares, percent)
            text_name_shares.text = item.nameShares

        }
    }
}