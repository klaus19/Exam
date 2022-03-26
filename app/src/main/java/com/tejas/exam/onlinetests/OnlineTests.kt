package com.tejas.exam.onlinetests

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.databinding.OnlineTestBinding

class OnlineTests:AppCompatActivity(){


    private lateinit var binding:OnlineTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = OnlineTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnTest1.setOnClickListener {
              startActivity(Intent(this@OnlineTests,Test1::class.java))
            }

            btnTest2.setOnClickListener {
                startActivity(Intent(this@OnlineTests,Test2::class.java))
            }
        }
    }


}