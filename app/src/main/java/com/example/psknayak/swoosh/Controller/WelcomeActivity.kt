package com.example.psknayak.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.example.psknayak.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStarted.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java) //explicit intent this is a context for this activity
            startActivity(leagueIntent)

        }
    }
}
