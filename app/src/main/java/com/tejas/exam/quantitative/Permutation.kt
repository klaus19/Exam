package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.tejas.exam.R
import com.tejas.exam.adapters.PermutationAdapter


class Permutation:AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.permutation)
        val viewPager = findViewById<ViewPager>(R.id.viewPagerPer)
        viewPager.adapter = PermutationAdapter(supportFragmentManager)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayoutPer)
        tabLayout.setupWithViewPager(viewPager)
    }
}