package com.tejas.exam.onlinetests

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.R
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

            btnTest3.setOnClickListener {
                startActivity(Intent(this@OnlineTests,Test3::class.java))
            }
        }

        val animation = AnimationUtils.loadAnimation(this, R.anim.shake)
        binding.btnContactMe.startAnimation(animation)


    }




}