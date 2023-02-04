package com.tejas.exam.onlinetests

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.R
import com.tejas.exam.databinding.OnlineTestBinding

class OnlineTests:AppCompatActivity(){


    private lateinit var binding:OnlineTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding = OnlineTestBinding.inflate(layoutInflater)
        val view:View = binding.root
        setContentView(view)

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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }



}