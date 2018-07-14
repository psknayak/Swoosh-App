package com.example.psknayak.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStarted.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java) //explicit intent this is a context for this activity
            startActivity(leagueIntent)

        }
    }
}
