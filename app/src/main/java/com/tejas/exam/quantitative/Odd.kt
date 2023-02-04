package com.tejas.exam.quantitative

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.OddAdapter
import com.tejas.exam.databinding.OddBinding

class Odd :AppCompatActivity() {

    private lateinit var binding: OddBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding = OddBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerOdd.adapter = OddAdapter(supportFragmentManager)
        binding.tabLayoutOdd.setupWithViewPager(binding.viewPagerOdd)
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