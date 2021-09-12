package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.tejas.exam.R
import com.tejas.exam.adapters.SimplificationAdapter

class Simplification:AppCompatActivity(R.layout.simplification) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewPager = findViewById<ViewPager>(R.id.viewPagerSimplification)
        viewPager.adapter = SimplificationAdapter(supportFragmentManager)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayoutSimplification)
        tabLayout.setupWithViewPager(viewPager)
    }
}