package com.tejas.exam.onlinetests

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.databinding.ActivityTest3Binding

class Test3:AppCompatActivity() {

    private lateinit var binding: ActivityTest3Binding

    var counter = 0
    var marks = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTest3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        startwithTimer()
        letsCountmarks()

        //button click listener
        binding.btnTest3Submit.setOnClickListener {

            countMarks()


        }

    }

     fun startwithTimer() {
        object : CountDownTimer(900000,1000){
            override fun onTick(millisUntilFinished: Long) {
                binding.timer1.text = counter.toString()
                counter++
            }

            override fun onFinish() {
                binding.timer1.text = "Finished"

            }

        }.start()
    }
    //counting the marks

    fun letsCountmarks() {

        with(binding) {

            radioGroup1.setOnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton2Test3.isChecked

                if (isChecked) {
                    marks++
                } else {
                    marks
                }
            }
            radioGroup2.setOnCheckedChangeListener { group, checkedId ->
                val isChecked = radioButton7Test3.isChecked
                if (isChecked) {
                    marks++
                } else {
                    marks
                }
            }

            radioGroup3.setOnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton9Test3.isChecked
                if (isChecked) {
                    marks++
                } else {
                    marks
                }
            }
            radioGroup4.setOnCheckedChangeListener { group, checkedId ->
                val isChecked = radioButton14Test3.isChecked
                if (isChecked) {
                    marks++
                } else {
                    marks
                }

            }
            radioGroup5.setOnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton17Test3.isChecked
                if (isChecked) {
                    marks++
                } else {
                    marks
                }

            }

            radioGroup6.setOnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton23Test3.isChecked
                if (isChecked) {
                    marks++
                } else {
                    marks
                }

            }

            radioGroup7.setOnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton25Test3.isChecked
                if (isChecked) {
                    marks++
                } else {
                    marks
                }

            }

            radioGroup8.setOnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton31Test3.isChecked
                if (isChecked) {
                    marks++
                } else {
                    marks
                }

            }

            radioGroup9.setOnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton36Test3.isChecked
                if (isChecked) {
                    marks++
                } else {
                    marks
                }

            }

            radioGroup10.setOnCheckedChangeListener { group, checkedId ->
                val isChecked = radioButton37Test3.isChecked
                if (isChecked) {
                    marks++
                } else {
                    marks
                }

            }

        }

    }

    //programmatically creating a Alert Dialog in Kotlin

    fun countMarks(){

        val builder = AlertDialog.Builder(this)
        val linear = LinearLayout(this)

        //Set a Title
        builder.setTitle("Final Score")

        //Set a Message
        builder.setMessage("You Final score is $marks")

        linear.orientation = LinearLayout.VERTICAL
        builder.setView(linear)

        //set a Positive Button
        builder.setPositiveButton(
            "Ok"){builder, id ->
            //Go back to OnlineTests.kt
            startActivity(Intent(this@Test3,OnlineTests::class.java))
        }

        builder.show()
    }
}