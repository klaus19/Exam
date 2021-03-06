package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.TimeDistanceAdapter
import com.tejas.exam.databinding.TimedistanceBinding

class TimeDistance:AppCompatActivity() {

    private lateinit var binding:TimedistanceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = TimedistanceBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerTimeDistance.adapter = TimeDistanceAdapter(supportFragmentManager)
        binding.tabLayoutTimeDistance.setupWithViewPager(binding.viewPagerTimeDistance)
    }
}