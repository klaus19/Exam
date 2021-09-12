package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.ClockAdapter
import com.tejas.exam.databinding.ClockBinding


class Clock:AppCompatActivity() {

    private lateinit var binding:ClockBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ClockBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerClocks.adapter = ClockAdapter(supportFragmentManager)
        binding.tabLayoutClocks.setupWithViewPager(binding.viewPagerClocks)


    }
}