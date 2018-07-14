package com.example.psknayak.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity()
{
    var league = ""
    var selectedSkill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
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
        if(selectedSkill==="")
            Toast.makeText(this, "Please mention your skill level.", Toast.LENGTH_SHORT).show()
    }
}

