package com.tejas.exam.reasoning

import android.graphics.Color
import android.os.Bundle
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



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
}