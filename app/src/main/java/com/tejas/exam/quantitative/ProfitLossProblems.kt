package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.tejas.exam.R
import com.tejas.exam.adapters.PageAdapter
import com.tejas.exam.adapters.ProfitLossAdapter

class ProfitLossProblems :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profitloss_problems)

        val viewPager = findViewById<ViewPager>(R.id.viewPagerProfitLoss)
        viewPager.adapter = ProfitLossAdapter(supportFragmentManager)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayoutProfitLoss)
        tabLayout.setupWithViewPager(viewPager)

    }
}