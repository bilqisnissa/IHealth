package com.muflihunnisa.ihealthapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_health_info.*
import kotlinx.android.synthetic.main.activity_main.*

class HealthInfoActivity : AppCompatActivity(), View.OnClickListener {
    companion object{
        fun getLaunchService (from: Context) = Intent(from, HealthInfoActivity::class.java).apply{
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_health_info)
        ib_arrow_hi.setOnClickListener(this)
        supportActionBar?.hide()
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.ib_arrow_hi -> startActivity(Intent(MainActivity.getLaunchService(this)))
        }
    }
}