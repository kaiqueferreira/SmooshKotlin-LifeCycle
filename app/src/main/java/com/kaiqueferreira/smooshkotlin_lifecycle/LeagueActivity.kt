package com.kaiqueferreira.smooshkotlin_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LeagueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
}