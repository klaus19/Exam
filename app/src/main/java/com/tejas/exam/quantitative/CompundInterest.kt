package com.tejas.exam.quantitative

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.CompundAdapter
import com.tejas.exam.databinding.CompoundinterestBinding

class CompundInterest:AppCompatActivity() {

    private lateinit var binding:CompoundinterestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding = CompoundinterestBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerCompound.adapter = CompundAdapter(supportFragmentManager)
        binding.tabLayoutCompound.setupWithViewPager(binding.viewPagerCompound)
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