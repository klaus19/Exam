package com.tejas.exam.dominika

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.R
import com.tejas.exam.adapters.MyListAdapter
import com.tejas.exam.verbal.*

class Verbal: AppCompatActivity() {


    val operations = arrayOf<String>("Logical Sequence of Words","Syllogisms","Blood Relation Test","Analogy","Classification","Arithmetic Reasoning"
       ,"Series Completion","Seating Arrangement","Direction Sense Test")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.verbal)

        val listview = findViewById<ListView>(R.id.listverbalProducts)
        val listAdapter = MyListAdapter(this, operations)

        listview.adapter = listAdapter

        listview.setOnItemClickListener { adapterView, view, position, id ->

            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            when (position) {

                0 -> {
                    val numberIntent = Intent(this, LogicalSequence::class.java)
                    startActivity(numberIntent)
                }
                1 -> {
                    val verbalClassificationIntent = Intent(this, Syllogism::class.java)
                    startActivity(verbalClassificationIntent)
                }
                2 -> {
                    val bi = Intent(this,BloodRelation::class.java)
                    startActivity(bi)
                }
                3->{
                    startActivity(Intent(this@Verbal,VerbalAnalogy::class.java))
                }
                4->{
                    startActivity(Intent(this@Verbal, Classification::class.java))
                }
                5->{
                    startActivity(Intent(this@Verbal,ArithmeticReasoning::class.java))
                }
                6->{
                    startActivity(Intent(this@Verbal,SeriesCompletion::class.java))
                }
                7->{
                    startActivity(Intent(this@Verbal,SittingArrangement::class.java))
                }
                8->{
                    startActivity(Intent(this@Verbal,DirectionTest::class.java))
                }


            }


        }
    }
}