package com.example.psknayak.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensToggle.isChecked = false
        kidsToggle.isChecked = false

        selectedLeague = "Men's"

    }

    fun onWomensClicked(view: View) {
        mensToggle.isChecked = false
        kidsToggle.isChecked = false

        selectedLeague = "Women's"
    }

    fun onKidsClicked(view: View) {
        mensToggle.isChecked = false
        womensToggle.isChecked = false

        selectedLeague = "Kid's"
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        }
        else
        {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }
}
