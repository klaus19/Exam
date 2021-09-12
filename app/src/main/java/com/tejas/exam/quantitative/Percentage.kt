package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.tejas.exam.R
import com.tejas.exam.adapters.PageAdapter
import com.tejas.exam.adapters.PercentageAdapter

class Percentage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_percentage)

        val viewPager = findViewById<ViewPager>(R.id.viewPagerPercentage)
        viewPager.adapter = PercentageAdapter(supportFragmentManager)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayoutPercentage)
        tabLayout.setupWithViewPager(viewPager)

    }
}