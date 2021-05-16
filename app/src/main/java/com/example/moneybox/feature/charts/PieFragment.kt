package com.example.moneybox.feature.charts

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.anychart.AnyChart
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry
import com.example.moneybox.R
import kotlinx.android.synthetic.main.pie_chart.*

class PieFragment: Fragment(R.layout.pie_chart) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pie = AnyChart.pie()
        pie.title("Fruits imported in 2015 (in kg)")

        val data: MutableList<DataEntry> = ArrayList()
        data.add(ValueDataEntry("John", 10000))
        data.add(ValueDataEntry("Jake", 12000))
        data.add(ValueDataEntry("Peter", 18000))

        pie.data(data)
//        pie.labels().position("outside")
//
//        pie.legend().title().enabled(true)
//        pie.legend().title()
//            .text("Retail channels")
//            .padding(0.0, 0.0, 10.0, 0.0)
//
//        pie.legend()
//            .position("center-bottom")
//            .itemsLayout(LegendLayout.HORIZONTAL)
//            .align(Align.CENTER)

        any_chart_vie.setChart(pie)
    }
}