package com.example.psknayak.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.psknayak.swoosh.Model.Player
import com.example.psknayak.swoosh.R
import com.example.psknayak.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)


        searchText.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }
}
