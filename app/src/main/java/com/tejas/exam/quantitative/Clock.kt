package com.tejas.exam.quantitative

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.ClockAdapter
import com.tejas.exam.databinding.ClockBinding


class Clock:AppCompatActivity() {

    private lateinit var binding:ClockBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding = ClockBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerClocks.adapter = ClockAdapter(supportFragmentManager)
        binding.tabLayoutClocks.setupWithViewPager(binding.viewPagerClocks)
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