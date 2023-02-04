package com.tejas.exam.quantitative

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.BoardAdapter
import com.tejas.exam.databinding.BoatsBinding

class Boats: AppCompatActivity() {

    private lateinit var binding: BoatsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding = BoatsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerBoats.adapter = BoardAdapter(supportFragmentManager)
        binding.tabLayoutBoats.setupWithViewPager(binding.viewPagerBoats)
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