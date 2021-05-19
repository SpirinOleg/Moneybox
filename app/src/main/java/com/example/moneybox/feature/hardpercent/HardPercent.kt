package com.example.moneybox.feature.hardpercent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.moneybox.R
import kotlinx.android.synthetic.main.hard_percent.*

class HardPercent: Fragment(R.layout.hard_percent) {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        navController = findNavController()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_hard_tax.setOnClickListener {
            text_result.visibility = View.VISIBLE
            image_hrd_tax.visibility = View.VISIBLE
            image_hrd_diag.visibility = View.VISIBLE
            res_you_invest.visibility = View.VISIBLE
            edt_res_you_invest.visibility = View.VISIBLE
            res_you_earn.visibility = View.VISIBLE
            edit_res_you_earn.visibility = View.VISIBLE
            res_final_sum.visibility = View.VISIBLE
            edt_res_final_sum.visibility = View.VISIBLE
            res_you_pay_tax.visibility = View.VISIBLE
            edt_res_you_pay_tax.visibility = View.VISIBLE
        }

    }
}