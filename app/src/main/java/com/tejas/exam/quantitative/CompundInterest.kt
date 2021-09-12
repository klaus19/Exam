package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.CompundAdapter
import com.tejas.exam.databinding.CompoundinterestBinding

class CompundInterest:AppCompatActivity() {

    private lateinit var binding:CompoundinterestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = CompoundinterestBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerCompound.adapter = CompundAdapter(supportFragmentManager)
        binding.tabLayoutCompound.setupWithViewPager(binding.viewPagerCompound)


    }
}