package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.tejas.exam.R
import com.tejas.exam.adapters.HCFAdapter

class HCF:AppCompatActivity(R.layout.hcf) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.hcf)

        val viewPager = findViewById<ViewPager>(R.id.viewPagerHCF)
        viewPager.adapter = HCFAdapter(supportFragmentManager)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayoutHCF)
        tabLayout.setupWithViewPager(viewPager)


    }

}