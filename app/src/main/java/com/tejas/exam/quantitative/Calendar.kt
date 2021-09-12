package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.tejas.exam.R
import com.tejas.exam.adapters.CalendarAdapter
import com.tejas.exam.adapters.PageAdapter

class Calendar: AppCompatActivity(R.layout.activity_calendar) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_calendar)

        val viewPager = findViewById<ViewPager>(R.id.viewPagerCalendar)
        viewPager.adapter = CalendarAdapter(supportFragmentManager)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayoutCalendar)
        tabLayout.setupWithViewPager(viewPager)

    }


}