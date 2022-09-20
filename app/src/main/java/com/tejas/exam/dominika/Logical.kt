package com.tejas.exam.dominika

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.R
import com.tejas.exam.adapters.MyListAdapter
import com.tejas.exam.reasoning.*


class Logical:AppCompatActivity() {


    val operations = arrayOf<String>("Number Series",
    "Verbal Classifications","Analogies","Matching Definitions","Verbal Reasoning","Cause and Effect",
    "Artificial Language","Logical Problems","Course of Action","Logical Deduction","Statement and Assumption")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reasoning)

        val listview = findViewById<ListView>(R.id.listreasoningProducts)
        val myListAdapter = MyListAdapter(this, operations)
        listview.adapter = myListAdapter


        listview.setOnItemClickListener { adapterView, view, position, id ->



            when(position) {

                    0->{
                        val numberIntent = Intent(this, NumberSeries::class.java)
                        startActivity(numberIntent)
                    }
                    1->{
                        val verbalClassificationIntent = Intent(this, VerbalClassification::class.java)
                        startActivity(verbalClassificationIntent)
                    }
                    2->{
                        val analogyIntent = Intent(this, Analogies::class.java)
                        startActivity(analogyIntent)
                    }
                    3->{
                    val matchingIntent = Intent(this, MatchingDefinition::class.java)
                    startActivity(matchingIntent)
                    }

                       4->{
                            val verbalreasoningIntent = Intent(this, VerbalReasoning::class.java)
                            startActivity(verbalreasoningIntent)
                    }
                    5->{
                        val causeEffectIntent = Intent(this,CauseEffect::class.java)
                        startActivity(causeEffectIntent)

                    }
                    6->{

                        startActivity(Intent(this@Logical,ArtificialLanguage::class.java))
                    }

                    7->{
                        val logicalIntent = Intent(this,LogicalProblems::class.java)
                        startActivity(logicalIntent)
                    }
                    8->{
                        startActivity(Intent(this@Logical,CourseAction::class.java))
                    }
                   9->{
                    val deductionIntent = Intent(this,LogicalDeduction::class.java)
                    startActivity(deductionIntent)
                    }
                   10->{
                    val statementAssumption = Intent(this,StatementAssumptions::class.java)
                    startActivity(statementAssumption)
                    }

            }



        }
    }
}