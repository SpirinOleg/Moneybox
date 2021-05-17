package com.example.moneybox.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moneybox.R
import com.example.moneybox.feature.charts.PieData
import com.example.moneybox.model.Council
import kotlinx.android.synthetic.main.item_briefcase_content.*
import kotlinx.android.synthetic.main.item_briefcase_content.any_chart_vie
import kotlinx.android.synthetic.main.item_council.*
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment: Fragment(R.layout.main_fragment) {
    private lateinit var navController: NavController
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<AdapterBriefcase.ViewHolder>? = null
    private var adapterTarget: RecyclerView.Adapter<AdapterTarget.ViewHolder>? = null
    private var council: Council = Council("")
    val data = PieData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        navController = findNavController()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_toolbar, menu)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        data.add("Sid", 18.0, "#4286f4")
        data.add("Nick", 4.0, "#44a837")
        data.add("Dik", 6.0, "#FF018786")
        data.add("Dave", 10.0, "#3A83F1")

        any_chart_vie.setData(data)

        council.textContext = getString(R.string.context_council)
        text_council_ontext.text = council.textContext

        btn_top_up.setOnClickListener { navController.navigate(R.id.action_main_dest_to_placeholder_top_up) }
        btn_exclude.setOnClickListener { navController.navigate(R.id.action_main_dest_to_placeholder_exclude) }
        card_briefcase.setOnClickListener { navController.navigate(R.id.action_main_dest_to_placeholder_briefcase) }

        briefcase.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = AdapterBriefcase()
        }

        target.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = AdapterTarget()
        }
    }
}