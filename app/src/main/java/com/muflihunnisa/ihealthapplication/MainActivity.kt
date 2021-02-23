package com.muflihunnisa.ihealthapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    companion object{
        fun getLaunchService (from: Context) = Intent(from, MainActivity::class.java).apply{
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        cv1.setOnClickListener(this)
        cv3.setOnClickListener(this)
        cv4.setOnClickListener(this)
        cv5.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.cv1 -> startActivity(Intent(CalmingSoundsActivity.getLaunchService(this)))
        }
        when(p0.id){
            R.id.cv3 -> startActivity(Intent(HospitalTrackActivity.getLaunchService(this)))
        }
        when(p0.id){
            R.id.cv4 -> startActivity(Intent(HealthInfoActivity.getLaunchService(this)))
        }
        when(p0.id){
            R.id.cv5 -> startActivity(Intent(MedicalSupplyActivity.getLaunchService(this)))
        }
    }
}