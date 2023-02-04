package com.tejas.exam.reasoning

import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.R
import com.tejas.exam.adapters.Tik.Companion.withColor

class CourseAction: AppCompatActivity() {


    @BindView(R.id.txtViewAnswer1CourseofAction)
    lateinit var txtViewAnswer1CourseofAction: TextView
    @BindView(R.id.textAnswer1CourseofAction)
    lateinit var textAnswer1CourseofAction: TextView
    @BindView(R.id.txtViewAnswer2CourseofAction)
    lateinit var txtViewAnswer2CourseofAction: TextView
    @BindView(R.id.textAnswer2CourseofAction)
    lateinit var textAnswer2CourseofAction: TextView
    @BindView(R.id.txtViewAnswer3CourseofAction)
    lateinit var txtViewAnswer3CourseofAction: TextView
    @BindView(R.id.textAnswer3CourseofAction)
    lateinit var textAnswer3CourseofAction: TextView
    @BindView(R.id.txtViewAnswer4CourseofAction)
    lateinit var txtViewAnswer4CourseofAction: TextView
    @BindView(R.id.textAnswer4CourseofAction)
    lateinit var textAnswer4CourseofAction: TextView
    @BindView(R.id.txtViewAnswer5CourseofAction)
    lateinit var txtViewAnswer5CourseofAction: TextView
    @BindView(R.id.textAnswer5CourseofAction)
    lateinit var textAnswer5CourseofAction: TextView
    @BindView(R.id.txtViewAnswer6CourseofAction)
    lateinit var txtViewAnswer6CourseofAction: TextView
    @BindView(R.id.textAnswer6CourseofAction)
    lateinit var textAnswer6CourseofAction: TextView
    @BindView(R.id.txtViewAnswer7CourseofAction)
    lateinit var txtViewAnswer7CourseofAction: TextView
    @BindView(R.id.textAnswer7CourseofAction)
    lateinit var textAnswer7CourseofAction: TextView
    @BindView(R.id.txtViewAnswer8CourseofAction)
    lateinit var txtViewAnswer8CourseofAction: TextView
    @BindView(R.id.textAnswer8CourseofAction)
    lateinit var textAnswer8CourseofAction: TextView
    @BindView(R.id.txtViewAnswer9CourseofAction)
    lateinit var txtViewAnswer9CourseofAction: TextView
    @BindView(R.id.textAnswer9CourseofAction)
    lateinit var textAnswer9CourseofAction: TextView
    @BindView(R.id.txtViewAnswer10CourseofAction)
    lateinit var txtViewAnswer10CourseofAction: TextView
    @BindView(R.id.textAnswer10CourseofAction)
    lateinit var textAnswer10CourseofAction: TextView
    @BindView(R.id.textAnswer11CourseofAction)
    lateinit var textAnswer11CourseofAction: TextView
    @BindView(R.id.textAnswer12CourseofAction)
    lateinit var textAnswer12CourseofAction: TextView
    @BindView(R.id.textAnswer13CourseofAction)
    lateinit var textAnswer13CourseofAction: TextView
    @BindView(R.id.textAnswer14CourseofAction)
    lateinit var textAnswer14CourseofAction: TextView
    @BindView(R.id.textAnswer15CourseofAction)
    lateinit var textAnswer15CourseofAction: TextView
    @BindView(R.id.textAnswer16CourseofAction)
    lateinit var textAnswer16CourseofAction: TextView
    @BindView(R.id.textAnswer17CourseofAction)
    lateinit var textAnswer17CourseofAction: TextView
    @BindView(R.id.textAnswer18CourseofAction)
    lateinit var textAnswer18CourseofAction: TextView
    @BindView(R.id.textAnswer19CourseofAction)
    lateinit var textAnswer19CourseofAction: TextView
    @BindView(R.id.textAnswer20CourseofAction)
    lateinit var textAnswer20CourseofAction: TextView
    @BindView(R.id.txtViewAnswer11CourseofAction)
    lateinit var txtViewAnswer11CourseofAction: TextView
    @BindView(R.id.txtViewAnswer12CourseofAction)
    lateinit var txtViewAnswer12CourseofAction: TextView
    @BindView(R.id.txtViewAnswer13CourseofAction)
    lateinit var txtViewAnswer13CourseofAction: TextView
    @BindView(R.id.txtViewAnswer14CourseofAction)
    lateinit var txtViewAnswer14CourseofAction: TextView
    @BindView(R.id.txtViewAnswer15CourseofAction)
    lateinit var txtViewAnswer15CourseofAction: TextView
    @BindView(R.id.txtViewAnswer16CourseofAction)
    lateinit var txtViewAnswer16CourseofAction: TextView
    @BindView(R.id.txtViewAnswer17CourseofAction)
    lateinit var txtViewAnswer17CourseofAction: TextView
    @BindView(R.id.txtViewAnswer18CourseofAction)
    lateinit var txtViewAnswer18CourseofAction: TextView
    @BindView(R.id.txtViewAnswer19CourseofAction)
    lateinit var txtViewAnswer19CourseofAction: TextView
    @BindView(R.id.txtViewAnswer20CourseofAction)
    lateinit var txtViewAnswer20CourseofAction: TextView
    
//    RadioGroup Binding
    @BindView(R.id.radioGroup1CourseofAction)
    lateinit var radioGroup1CourseofAction: RadioGroup
    @BindView(R.id.radioGroup2CourseofAction)
    lateinit var radioGroup2CourseofAction: RadioGroup
    @BindView(R.id.radioGroup3CourseofAction)
    lateinit var radioGroup3CourseofAction: RadioGroup
    @BindView(R.id.radioGroup4CourseofAction)
    lateinit var radioGroup4CourseofAction: RadioGroup
    @BindView(R.id.radioGroup5CourseofAction)
    lateinit var radioGroup5CourseofAction: RadioGroup
    @BindView(R.id.radioGroup6CourseofAction)
    lateinit var radioGroup6CourseofAction: RadioGroup
    @BindView(R.id.radioGroup7CourseofAction)
    lateinit var radioGroup7CourseofAction: RadioGroup
    @BindView(R.id.radioGroup8CourseofAction)
    lateinit var radioGroup8CourseofAction: RadioGroup
    @BindView(R.id.radioGroup9CourseofAction)
    lateinit var radioGroup9CourseofAction: RadioGroup
    @BindView(R.id.radioGroup10CourseofAction)
    lateinit var radioGroup10CourseofAction: RadioGroup
    @BindView(R.id.radioGroup11CourseofAction)
    lateinit var radioGroup11CourseofAction: RadioGroup
    @BindView(R.id.radioGroup12CourseofAction)
    lateinit var radioGroup12CourseofAction: RadioGroup
    @BindView(R.id.radioGroup13CourseofAction)
    lateinit var radioGroup13CourseofAction: RadioGroup
    @BindView(R.id.radioGroup14CourseofAction)
    lateinit var radioGroup14CourseofAction: RadioGroup
    @BindView(R.id.radioGroup15CourseofAction)
    lateinit var radioGroup15CourseofAction: RadioGroup
    @BindView(R.id.radioGroup16CourseofAction)
    lateinit var radioGroup16CourseofAction: RadioGroup
    @BindView(R.id.radioGroup17CourseofAction)
    lateinit var radioGroup17CourseofAction: RadioGroup
    @BindView(R.id.radioGroup18CourseofAction)
    lateinit var radioGroup18CourseofAction: RadioGroup
    @BindView(R.id.radioGroup19CourseofAction)
    lateinit var radioGroup19CourseofAction: RadioGroup
    @BindView(R.id.radioGroup20CourseofAction)
    lateinit var radioGroup20CourseofAction: RadioGroup
            



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_course_of_action)
        ButterKnife.bind(this)


        txtViewAnswer1CourseofAction.setOnClickListener {
            textAnswer1CourseofAction.visibility = if (textAnswer1CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }


        txtViewAnswer2CourseofAction.setOnClickListener {
            textAnswer2CourseofAction.visibility = if (textAnswer2CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }


        txtViewAnswer3CourseofAction.setOnClickListener {
            textAnswer3CourseofAction.visibility = if (textAnswer3CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        txtViewAnswer4CourseofAction.setOnClickListener {
            textAnswer4CourseofAction.visibility = if (textAnswer4CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        txtViewAnswer5CourseofAction.setOnClickListener {
            textAnswer5CourseofAction.visibility = if (textAnswer5CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }


        txtViewAnswer6CourseofAction.setOnClickListener {
            textAnswer6CourseofAction.visibility = if (textAnswer6CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        txtViewAnswer7CourseofAction.setOnClickListener {
            textAnswer7CourseofAction.visibility = if (textAnswer7CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        txtViewAnswer8CourseofAction.setOnClickListener {
            textAnswer8CourseofAction.visibility = if (textAnswer8CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        txtViewAnswer9CourseofAction.setOnClickListener {
            textAnswer9CourseofAction.visibility = if (textAnswer9CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        txtViewAnswer10CourseofAction.setOnClickListener {
            textAnswer10CourseofAction.visibility = if (textAnswer10CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        txtViewAnswer11CourseofAction.setOnClickListener {
            textAnswer11CourseofAction.visibility = if (textAnswer11CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer12CourseofAction.setOnClickListener {
            textAnswer12CourseofAction.visibility = if (textAnswer12CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer13CourseofAction.setOnClickListener {
            textAnswer13CourseofAction.visibility = if (textAnswer13CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer14CourseofAction.setOnClickListener {
            textAnswer14CourseofAction.visibility = if (textAnswer14CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer15CourseofAction.setOnClickListener {
            textAnswer15CourseofAction.visibility = if (textAnswer15CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer16CourseofAction.setOnClickListener {
            textAnswer16CourseofAction.visibility = if (textAnswer16CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer17CourseofAction.setOnClickListener {
            textAnswer17CourseofAction.visibility = if (textAnswer17CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer18CourseofAction.setOnClickListener {
            textAnswer18CourseofAction.visibility = if (textAnswer18CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer19CourseofAction.setOnClickListener {
            textAnswer19CourseofAction.visibility = if (textAnswer19CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer20CourseofAction.setOnClickListener {
            textAnswer20CourseofAction.visibility = if (textAnswer20CourseofAction.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        radioGroup11CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId==R.id.radioButton42CourseofAction) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup12CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId==R.id.radioButton48CourseofAction) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        radioGroup13CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId == R.id.radioButton50CourseofAction) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup14CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId==R.id.radioButton53CourseofAction) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        radioGroup15CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId == R.id.radioButton59CourseofAction) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        radioGroup16CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId==R.id.radioButton62CourseofAction) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        radioGroup17CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId==R.id.radioButton66CourseofAction) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        radioGroup18CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId ==R.id.radioButton69CourseofAction) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        radioGroup19CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId==R.id.radioButton73CourseofAction) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        radioGroup20CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId==R.id.radioButton78CourseofAction) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        
        radioGroup1CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

           

            if(checkedId ==R.id.radioButton4CourseofAction){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup2CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

           

            if(checkedId==R.id.radioButton6CourseofAction){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup3CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            

            if(checkedId ==R.id.radioButton9CourseofAction){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup4CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            

            if(checkedId ==R.id.radioButton16CourseofAction){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup5CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

          

            if(checkedId==R.id.radioButton20CourseofAction){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup6CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            

            if(checkedId==R.id.radioButton22CourseofAction){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup7CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

          

            if(checkedId ==R.id.radioButton25CourseofAction){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup8CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            

            if(checkedId ==R.id.radioButton30CourseofAction){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup9CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

           

            if(checkedId==R.id.radioButton36CourseofAction){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup10CourseofAction.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

           

            if(checkedId ==R.id.radioButton38CourseofAction){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
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