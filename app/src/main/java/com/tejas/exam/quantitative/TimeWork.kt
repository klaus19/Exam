package com.tejas.exam.quantitative

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.TimeWorkAdapter
import com.tejas.exam.databinding.TimeworkBinding

class TimeWork: AppCompatActivity() {

       private lateinit var binding:TimeworkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding = TimeworkBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerWork.adapter = TimeWorkAdapter(supportFragmentManager)
        binding.tabLayoutWork.setupWithViewPager(binding.viewPagerWork)


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