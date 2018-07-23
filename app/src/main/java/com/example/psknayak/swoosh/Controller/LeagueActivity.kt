package com.example.psknayak.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.psknayak.swoosh.Model.Player
import com.example.psknayak.swoosh.R
import com.example.psknayak.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null)
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensToggle.isChecked = false
        kidsToggle.isChecked = false

        player.league = "Men's"

    }

    fun onWomensClicked(view: View) {
        mensToggle.isChecked = false
        kidsToggle.isChecked = false

        player.league = "Women's"
    }

    fun onKidsClicked(view: View) {
        mensToggle.isChecked = false
        womensToggle.isChecked = false

        player.league = "Kid's"
    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        }
        else
        {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }
}
