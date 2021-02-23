package com.muflihunnisa.ihealthapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.muflihunnisa.ihealthapplication.MsListActivity.Companion.getLaunchService
import kotlinx.android.synthetic.main.activity_detail_ms.*

class DetailMsActivity : AppCompatActivity(), View.OnClickListener {
    companion object{
        fun getLaunchService (from: Context) = Intent(from, DetailMsActivity::class.java).apply{
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_ms)
        ib_back_detail_ms.setOnClickListener(this)
        supportActionBar?.hide()
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.ib_back_detail_ms -> startActivity(Intent(MsListActivity.getLaunchService(this)))
        }
    }
}