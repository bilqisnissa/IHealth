package com.muflihunnisa.ihealthapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_onboarding3.*

class Onboarding3Activity : AppCompatActivity(), View.OnClickListener {
    companion object{
        fun getLaunchService (from : Context) = Intent(from, Onboarding3Activity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)
        supportActionBar?.hide()

        btn_onboarding3.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btn_onboarding3 -> startActivity(Intent(MainActivity.getLaunchService(this)))
        }
    }
}