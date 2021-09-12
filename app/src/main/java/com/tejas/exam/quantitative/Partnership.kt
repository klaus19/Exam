package com.tejas.exam.quantitative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.adapters.PartnershipAdapter
import com.tejas.exam.databinding.PartnershipBinding


class Partnership:AppCompatActivity() {

    private lateinit var binding: PartnershipBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = PartnershipBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.viewPagerPartner.adapter = PartnershipAdapter(supportFragmentManager)
        binding.tabLayoutPartner.setupWithViewPager(binding.viewPagerPartner)


    }
}