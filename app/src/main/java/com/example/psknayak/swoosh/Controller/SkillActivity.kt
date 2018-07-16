package com.example.psknayak.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.psknayak.swoosh.Utilities.EXTRA_LEAGUE
import com.example.psknayak.swoosh.R
import com.example.psknayak.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity()
{
    var league = ""
    var selectedSkill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClicked(view: View)
    {
        ballerToggle.isChecked = false

        selectedSkill = "Beginner"
    }

    fun onBallerClicked(view: View)
    {
        beginnerToggle.isChecked = false

        selectedSkill = "Baller"
    }

    fun finishClicked(view: View)
    {
        if(selectedSkill!="") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,selectedSkill)
            startActivity(finishActivity)
        }
        else
            Toast.makeText(this, "Please mention your skill level", Toast.LENGTH_SHORT).show()
    }
}

