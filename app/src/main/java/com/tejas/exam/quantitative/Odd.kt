package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.OddAdapter
import com.tejas.exam.databinding.OddBinding

class Odd :AppCompatActivity() {

    private lateinit var binding: OddBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = OddBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerOdd.adapter = OddAdapter(supportFragmentManager)
        binding.tabLayoutOdd.setupWithViewPager(binding.viewPagerOdd)
    }
}