package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.TimeWorkAdapter
import com.tejas.exam.databinding.TimeworkBinding

class TimeWork: AppCompatActivity() {

       private lateinit var binding:TimeworkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = TimeworkBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerWork.adapter = TimeWorkAdapter(supportFragmentManager)
        binding.tabLayoutWork.setupWithViewPager(binding.viewPagerWork)


    }
}