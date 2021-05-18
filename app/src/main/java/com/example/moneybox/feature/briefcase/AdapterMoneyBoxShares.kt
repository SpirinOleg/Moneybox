package com.example.moneybox.feature.briefcase

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.recyclerview.widget.RecyclerView
import com.example.moneybox.R
import com.example.moneybox.model.Recomendation
import kotlinx.android.synthetic.main.item_moneybox_shares.view.*
import kotlinx.android.synthetic.main.item_shares_briefcase.view.*
import java.text.MessageFormat

class AdapterMoneyBoxShares: RecyclerView.Adapter<AdapterMoneyBoxShares.ViewHolder>() {

    lateinit var seekBar: SeekBar

    var recomendation: List<Recomendation> = listOf(
            Recomendation("#F70512",30,"Акции"),
            Recomendation("#3A83F1",40,"Облигации"),
            Recomendation("#8BD5FF",20,"Валюта"),
            Recomendation("#F99F36",10,"Золото")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_moneybox_shares, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(recomendation[position])
        holder.seekBar.setOnSeekBarChangeListener( object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                holder.percentText.text = p1.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}

            override fun onStopTrackingTouch(p0: SeekBar?) {}

        })
    }

    override fun getItemCount(): Int {
        return recomendation.size
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val messagePattern = "{0}{1}"
        private val percent = itemView.context.getString(R.string.percent_shares)
        val seekBar = itemView.seekBar
        val percentText = itemView.percent_moneybox_shares

        fun bind(item: Recomendation)= with(itemView){
            seekBar.progress = item.percentShares
            percent_moneybox_shares.text = MessageFormat.format(messagePattern, item.percentShares, percent)
            name_moneybox_shares.text = item.nameShares
        }
    }
}