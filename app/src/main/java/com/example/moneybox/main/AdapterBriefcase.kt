package com.example.moneybox.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moneybox.R
import com.example.moneybox.model.Briefcase
import kotlinx.android.synthetic.main.item_shares.view.*
import java.text.MessageFormat

class AdapterBriefcase: RecyclerView.Adapter<AdapterBriefcase.ViewHolder>() {

    var testBriefcase: List<Briefcase> =  listOf(
            Briefcase( "Сырьевая промышленность", 27.0F, 27),
            Briefcase( "Электроэнергетика", 13.5F, 13),
            Briefcase( "Энергетика", 17.0F, 17),
            Briefcase( "Телекоммуникации", 57.4F, 57),
            Briefcase( "Машиностроение и транспорт", 98.0F, 98),
            Briefcase( "Потребительские товары", 2.0F, 2)
    )

    private var data: List<Briefcase> = testBriefcase


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_shares, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val MESSAGE_PATTERN = "{0}{1}"
        val percent = itemView.context.getString(R.string.percent_shares)

        fun bind(item: Briefcase) = with(itemView){
            itemView.text.text = item.category
            itemView.shares_bar.progress = item.percent
            itemView.text_percent_shares.text = MessageFormat.format(MESSAGE_PATTERN, item.textPercent, percent)
        }
    }
}