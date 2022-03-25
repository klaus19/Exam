package com.tejas.exam.onlinetests

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.databinding.ActivityTest2Binding

class Test2:AppCompatActivity() {

   private lateinit var binding:ActivityTest2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTest2Binding.inflate(layoutInflater)
        binding.apply {
            setContentView(binding.root)
        }




    }
}