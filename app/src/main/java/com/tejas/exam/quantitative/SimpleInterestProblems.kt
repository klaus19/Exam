package com.tejas.exam.quantitative

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.tejas.exam.R
import com.tejas.exam.adapters.SimpleInterestAdapter

class SimpleInterestProblems: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.simpleinterest_problems)

        val viewPager = findViewById<ViewPager>(R.id.viewPagerSimpleInterest)
        viewPager.adapter = SimpleInterestAdapter(supportFragmentManager)

        val tabLayoutSimpleInterest = findViewById<TabLayout>(R.id.tabLayoutSimpleInterest)
        tabLayoutSimpleInterest.setupWithViewPager(viewPager)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}