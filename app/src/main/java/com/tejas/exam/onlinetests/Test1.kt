package com.tejas.exam.onlinetests

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.databinding.ActivityTest1Binding
import kotlin.properties.Delegates

class Test1:AppCompatActivity() {

    private lateinit var binding:ActivityTest1Binding
    var counter=0
    var marks:Int=0
    var newMarks by Delegates.notNull<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        startwithTimer()

        binding.btnTest1Submit.setOnClickListener {
              countMarks()
        }
    }
    fun startwithTimer(){
        object : CountDownTimer(150000,1000){
            override fun onTick(millisUntilFinished: Long) {
                binding.timer1.text = counter.toString()
                counter++
            }

            override fun onFinish() {
                binding.timer1.text = "Finished"
            }

        }.start()
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
                startActivity(Intent(this@Test1,OnlineTests::class.java))
            }

            builder.show()


        }

}