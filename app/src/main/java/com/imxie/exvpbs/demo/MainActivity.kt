package com.imxie.exvpbs.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVP.setOnClickListener {
            startActivity(Intent(this, ViewPagerActivity::class.java))
        }
        btnVP2.setOnClickListener {
            startActivity(Intent(this, ViewPager2Activity::class.java))
        }
    }
}
