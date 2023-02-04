package com.tejas.exam.quantitative

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.AreaAdapter
import com.tejas.exam.databinding.AreaBinding


class Area:AppCompatActivity() {

    private lateinit var binding:AreaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding = AreaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerArea.adapter = AreaAdapter(supportFragmentManager)
        binding.tabLayoutArea.setupWithViewPager(binding.viewPagerArea)

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