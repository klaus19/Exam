package com.tejas.exam.quantitative

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.AgesAdapter
import com.tejas.exam.databinding.AgesBinding


class Ages: AppCompatActivity() {

    private lateinit var binding:AgesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding = AgesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerAges.adapter = AgesAdapter(supportFragmentManager)
        binding.tabLayoutAges.setupWithViewPager(binding.viewPagerAges)
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