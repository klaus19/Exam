package com.tejas.exam.dominika

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.tejas.exam.R

class Aptitude: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setHomeButtonEnabled(true)
        setContentView(R.layout.quantitative_arithmetic)
        val card1 = findViewById<CardView>(R.id.cardViewArithmeticProblems)


        card1.setOnClickListener {
            startActivity(Intent(this@Aptitude,Arithmetic::class.java))
        }
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