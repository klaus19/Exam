package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.tejas.exam.R
import com.tejas.exam.adapters.PageAdapter

class TrainsProblems : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trains_problems)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter = PageAdapter(supportFragmentManager)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        tabLayout.setupWithViewPager(viewPager)




    }
}