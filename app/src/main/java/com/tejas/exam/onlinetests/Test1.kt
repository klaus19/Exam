package com.tejas.exam.onlinetests

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.databinding.ActivityTest1Binding

class Test1:AppCompatActivity() {

    private lateinit var binding:ActivityTest1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}