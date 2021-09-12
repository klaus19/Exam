package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.BoardAdapter
import com.tejas.exam.databinding.BoatsBinding

class Boats: AppCompatActivity() {

    private lateinit var binding: BoatsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = BoatsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerBoats.adapter = BoardAdapter(supportFragmentManager)
        binding.tabLayoutBoats.setupWithViewPager(binding.viewPagerBoats)



    }


}