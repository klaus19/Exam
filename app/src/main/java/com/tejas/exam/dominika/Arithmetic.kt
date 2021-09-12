package com.tejas.exam.dominika

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.R
import com.tejas.exam.adapters.MyListAdapter
import com.tejas.exam.quantitative.*

class Arithmetic:AppCompatActivity() {

    val operations = arrayOf<String>(
        "Problems on Trains",
        "Simple Interest",
        "Profit and Loss",
        "Percentage",
        "Calendar",
        "Average",
        "Problems on H.C.F and L.C.M",
        "Simplification",
        "Boats and Streams",
        "Odd Man Out and Series",
        "Time and Distance",
        "Time and Work",
        "Compound Interest",
        "Partnership",
        "Problems on Ages",
        "Clock",
        "Area",
        "Permutation and Combination"
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.arithmetic)


        val listView1 = findViewById<ListView>(R.id.listarithmetics)
        val myListAdapter = MyListAdapter(this, operations)
        listView1.adapter = myListAdapter

        listView1.setOnItemClickListener() { adapterView, view, position, id ->


            when (position) {

                0->{ val trains = Intent(this, TrainsProblems::class.java)
                    startActivity(trains)
                }

                1->{ val simpleInterest = Intent(this, SimpleInterestProblems::class.java)
                    startActivity(simpleInterest)
                }
                2->{
                    val profit = Intent(this, ProfitLossProblems::class.java)
                    startActivity(profit)
                }
                3->{
                    val percentage = Intent(this, Percentage::class.java)
                    startActivity(percentage)
                }
                4->{
                    val calendar = Intent(this, Calendar::class.java)
                    startActivity(calendar)
                }
                5->{
                    val average = Intent(this, Average::class.java)
                    startActivity(average)
                }
                6->{
                    val hcf = Intent(this, HCF::class.java)
                    startActivity(hcf)
                }
                7->{
                    val s = Intent(this, Simplification::class.java)
                    startActivity(s)
                }
                8->{
                    val boats = Intent(this, Boats::class.java)
                    startActivity(boats)
                }
                9->{
                    val odd = Intent(this, Odd::class.java)
                    startActivity(odd)
                }
                10->{
                    val timedistance = Intent(this, TimeDistance::class.java)
                    startActivity(timedistance)
                }
                11->{
                    val timework = Intent(this, TimeWork::class.java)
                    startActivity(timework)
                }
                12->{
                    val compoundInterest = Intent(this, CompundInterest::class.java)
                    startActivity(compoundInterest)
                }
                13->{
                    val partnership = Intent(this, Partnership::class.java)
                    startActivity(partnership)
                }
                14->{
                    val age = Intent(this, Ages::class.java)
                    startActivity(age)
                }
                15->{
                    val clock = Intent(this,Clock::class.java)
                    startActivity(clock)
                }
                16->{
                    val area = Intent(this,Area::class.java)
                    startActivity(area)
                }
                17->{
                    val p = Intent(this,Permutation::class.java)
                    startActivity(p)
                }


            }


        }

    }
}