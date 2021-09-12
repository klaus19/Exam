package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.AreaAdapter
import com.tejas.exam.databinding.AreaBinding


class Area:AppCompatActivity() {

    private lateinit var binding:AreaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = AreaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerArea.adapter = AreaAdapter(supportFragmentManager)
        binding.tabLayoutArea.setupWithViewPager(binding.viewPagerArea)

    }


}