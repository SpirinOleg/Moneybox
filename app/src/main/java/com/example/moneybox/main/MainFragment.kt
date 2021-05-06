package com.example.moneybox.main

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.moneybox.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment: Fragment(R.layout.main_fragment) {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        navController = findNavController()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_toolbar, menu)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_top_up.setOnClickListener { navController.navigate(R.id.action_main_dest_to_placeholder_top_up) }
        btn_exclude.setOnClickListener { navController.navigate(R.id.action_main_dest_to_placeholder_exclude) }

    }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            return when (item.itemId) {
                R.id.action_settings -> {
                    // navigate to settings screen
                    true
                }
                else -> super.onOptionsItemSelected(item)
            }
        }

}