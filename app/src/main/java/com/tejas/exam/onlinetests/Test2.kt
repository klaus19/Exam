package com.tejas.exam.onlinetests

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.databinding.ActivityTest2Binding

class Test2:AppCompatActivity() {

   private lateinit var binding:ActivityTest2Binding
   var counter=0
   var marks=0
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTest2Binding.inflate(layoutInflater)
        binding.apply {
            setContentView(binding.root)
        }
        startwithTimer()
        letsCountmarks()
        binding.btnTest2Submit.setOnClickListener {

            countMarks()
        }
    }

    //counting the marks

    fun letsCountmarks() {

         with(binding){

             radioGroup1Test1.setOnCheckedChangeListener { group, checkedId ->

                 val isChecked = radioButton2Test2.isChecked

                 if(isChecked){
                     marks++
                 }else{
                     marks
                 }
             }
             radioGroup2Test2.setOnCheckedChangeListener { group, checkedId ->
                 val isChecked = radioButton5Test2.isChecked
                 if(isChecked){
                     marks++
                 }else{
                     marks
                 }
             }

           radioGroup3.setOnCheckedChangeListener { group, checkedId ->

               val isChecked = radioButton9Test2.isChecked
               if(isChecked){
                   marks++
               }else{
                   marks
               }
           }
             radioGroup4.setOnCheckedChangeListener { group, checkedId ->
                 val isChecked = radioButton15Test2.isChecked
                 if(isChecked){
                     marks++
                 }else{
                     marks
                 }

             }
             radioGroup5.setOnCheckedChangeListener { group, checkedId ->

                 val isChecked = radioButton17Test2.isChecked
                 if(isChecked){
                     marks++
                 }else{
                     marks
                 }

             }

             radioGroup6.setOnCheckedChangeListener { group, checkedId ->

                 val isChecked = radioButton22Test2.isChecked
                 if(isChecked){
                     marks++
                 }else{
                     marks
                 }

             }

             radioGroup7.setOnCheckedChangeListener { group, checkedId ->

                 val isChecked = radioButton26Test2.isChecked
                 if(isChecked){
                     marks++
                 }else{
                     marks
                 }

             }

             radioGroup8.setOnCheckedChangeListener { group, checkedId ->

                 val isChecked = radioButton30Test2.isChecked
                 if(isChecked){
                     marks++
                 }else{
                     marks
                 }

             }

             radioGroup9.setOnCheckedChangeListener { group, checkedId ->

                 val isChecked = radioButton35Test2.isChecked
                 if(isChecked){
                     marks++
                 }else{
                     marks
                 }

             }

             radioGroup10.setOnCheckedChangeListener { group, checkedId ->
                 val isChecked = radioButton38Test2.isChecked
                 if(isChecked){
                     marks++
                 }else{
                     marks
                 }

             }

         }

    }

    //Setting a Timer
    fun startwithTimer(){
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
            startActivity(Intent(this@Test2,OnlineTests::class.java))
        }

        builder.show()
    }
}