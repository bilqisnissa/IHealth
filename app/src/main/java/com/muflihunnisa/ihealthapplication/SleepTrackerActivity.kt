package com.muflihunnisa.ihealthapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sleep_tracker.*

class SleepTrackerActivity : AppCompatActivity(), View.OnClickListener {
    companion object{
        fun getLaunchService (from: Context) = Intent(from, ProfileActivity::class.java).apply{
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sleep_tracker)
        supportActionBar?.hide()

        ib_back_sleeptracker.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.ib_back_sleeptracker -> startActivity(Intent(MainActivity.getLaunchService(this)))
        }
    }
}