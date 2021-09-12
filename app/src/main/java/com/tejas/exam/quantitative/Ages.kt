package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.AgesAdapter
import com.tejas.exam.databinding.AgesBinding


class Ages: AppCompatActivity() {

    private lateinit var binding:AgesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      // setContentView(R.layout.ages)
        binding = AgesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerAges.adapter = AgesAdapter(supportFragmentManager)
        binding.tabLayoutAges.setupWithViewPager(binding.viewPagerAges)
    }
}