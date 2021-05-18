package com.example.moneybox.feature.briefcase

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moneybox.R
import kotlinx.android.synthetic.main.item_moneybox.*
import kotlinx.android.synthetic.main.layout_risk_briefcase.*


class Briefcase: Fragment(R.layout.briefcase) {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        navController = findNavController()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val numberOfColumns =2

        recycler_moneybox.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = AdapterMoneyBoxShares()
        }

        recycler_shares_briefcase.apply {
            layoutManager = GridLayoutManager(context, numberOfColumns)
            adapter = AdapterSettingsBriefcase()
        }
    }

}