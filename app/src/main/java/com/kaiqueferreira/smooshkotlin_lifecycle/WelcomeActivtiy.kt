package com.kaiqueferreira.smooshkotlin_lifecycle

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivtiy : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


        button_start.setOnClickListener {
            val leagueIntent = Intent(this,LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}