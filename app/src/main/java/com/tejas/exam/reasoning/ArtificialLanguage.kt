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

class ArtificialLanguage: AppCompatActivity() {

    @BindView(R.id.txtViewAnswer1ArtificialIntelligence)
    lateinit var txtViewAnswer1ArtificialIntelligence: TextView
    @BindView(R.id.textAnswer1ArtificialIntelligence)
    lateinit var textAnswer1ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer2ArtificialIntelligence)
    lateinit var txtViewAnswer2ArtificialIntelligence: TextView
    @BindView(R.id.textAnswer2ArtificialIntelligence)
    lateinit var textAnswer2ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer3ArtificialIntelligence)
    lateinit var txtViewAnswer3ArtificialIntelligence: TextView
    @BindView(R.id.textAnswer3ArtificialIntelligence)
    lateinit var textAnswer3ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer4ArtificialIntelligence)
    lateinit var txtViewAnswer4ArtificialIntelligence: TextView
    @BindView(R.id.textAnswer4ArtificialIntelligence)
    lateinit var textAnswer4ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer5ArtificialIntelligence)
    lateinit var txtViewAnswer5ArtificialIntelligence: TextView
    @BindView(R.id.textAnswer5ArtificialIntelligence)
    lateinit var textAnswer5ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer6ArtificialIntelligence)
    lateinit var txtViewAnswer6ArtificialIntelligence: TextView
    @BindView(R.id.textAnswer6ArtificialIntelligence)
    lateinit var textAnswer6ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer7ArtificialIntelligence)
    lateinit var txtViewAnswer7ArtificialIntelligence: TextView
    @BindView(R.id.textAnswer7ArtificialIntelligence)
    lateinit var textAnswer7ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer8ArtificialIntelligence)
    lateinit var txtViewAnswer8ArtificialIntelligence: TextView
    @BindView(R.id.textAnswer8ArtificialIntelligence)
    lateinit var textAnswer8ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer9ArtificialIntelligence)
    lateinit var txtViewAnswer9ArtificialIntelligence: TextView
    @BindView(R.id.textAnswer9ArtificialIntelligence)
    lateinit var textAnswer9ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer10ArtificialIntelligence)
    lateinit var txtViewAnswer10ArtificialIntelligence: TextView
    @BindView(R.id.textAnswer10ArtificialIntelligence)
    lateinit var textAnswer10ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer11ArtificialIntelligence)
    lateinit var txtViewAnswer11ArtificialIntelligence:TextView
    @BindView(R.id.textAnswer11ArtificialIntelligence)
    lateinit var textAnswer11ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer12ArtificialIntelligence)
    lateinit var txtViewAnswer12ArtificialIntelligence:TextView
    @BindView(R.id.textAnswer12ArtificialIntelligence)
    lateinit var textAnswer12ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer13ArtificialIntelligence)
    lateinit var txtViewAnswer13ArtificialIntelligence:TextView
    @BindView(R.id.textAnswer13ArtificialIntelligence)
    lateinit var textAnswer13ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer14ArtificialIntelligence)
    lateinit var txtViewAnswer14ArtificialIntelligence:TextView
    @BindView(R.id.textAnswer14ArtificialIntelligence)
    lateinit var textAnswer14ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer15ArtificialIntelligence)
    lateinit var txtViewAnswer15ArtificialIntelligence:TextView
    @BindView(R.id.textAnswer15ArtificialIntelligence)
    lateinit var textAnswer15ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer16ArtificialIntelligence)
    lateinit var txtViewAnswer16ArtificialIntelligence:TextView
    @BindView(R.id.textAnswer16ArtificialIntelligence)
    lateinit var textAnswer16ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer17ArtificialIntelligence)
    lateinit var txtViewAnswer17ArtificialIntelligence:TextView
    @BindView(R.id.textAnswer17ArtificialIntelligence)
    lateinit var textAnswer17ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer18ArtificialIntelligence)
    lateinit var txtViewAnswer18ArtificialIntelligence:TextView
    @BindView(R.id.textAnswer18ArtificialIntelligence)
    lateinit var textAnswer18ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer19ArtificialIntelligence)
    lateinit var txtViewAnswer19ArtificialIntelligence:TextView
    @BindView(R.id.textAnswer19ArtificialIntelligence)
    lateinit var textAnswer19ArtificialIntelligence: TextView
    @BindView(R.id.txtViewAnswer20ArtificialIntelligence)
    lateinit var txtViewAnswer20ArtificialIntelligence:TextView
    @BindView(R.id.textAnswer20ArtificialIntelligence)
    lateinit var textAnswer20ArtificialIntelligence: TextView
    
//    RadioGroup Binding
    @BindView(R.id.radioGroup1ArtificialIntelligence)
    lateinit var radioGroup1ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup2ArtificialIntelligence)
    lateinit var radioGroup2ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup3ArtificialIntelligence)
    lateinit var radioGroup3ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup4ArtificialIntelligence)
    lateinit var radioGroup4ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup5ArtificialIntelligence)
    lateinit var radioGroup5ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup6ArtificialIntelligence)
    lateinit var radioGroup6ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup7ArtificialIntelligence)
    lateinit var radioGroup7ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup8ArtificialIntelligence)
    lateinit var radioGroup8ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup9ArtificialIntelligence)
    lateinit var radioGroup9ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup10ArtificialIntelligence)
    lateinit var radioGroup10ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup11ArtificialIntelligence)
    lateinit var radioGroup11ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup12ArtificialIntelligence)
    lateinit var radioGroup12ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup13ArtificialIntelligence)
    lateinit var radioGroup13ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup14ArtificialIntelligence)
    lateinit var radioGroup14ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup15ArtificialIntelligence)
    lateinit var radioGroup15ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup16ArtificialIntelligence)
    lateinit var radioGroup16ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup17ArtificialIntelligence)
    lateinit var radioGroup17ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup18ArtificialIntelligence)
    lateinit var radioGroup18ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup19ArtificialIntelligence)
    lateinit var radioGroup19ArtificialIntelligence: RadioGroup
    @BindView(R.id.radioGroup20ArtificialIntelligence)
    lateinit var radioGroup20ArtificialIntelligence: RadioGroup








    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artificial_intelligence)
        ButterKnife.bind(this)

        txtViewAnswer1ArtificialIntelligence?.setOnClickListener {
            textAnswer1ArtificialIntelligence.visibility = if (textAnswer1ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }


        txtViewAnswer2ArtificialIntelligence?.setOnClickListener {
            textAnswer2ArtificialIntelligence.visibility = if (textAnswer2ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }


        txtViewAnswer3ArtificialIntelligence?.setOnClickListener {
            textAnswer3ArtificialIntelligence.visibility = if (textAnswer3ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        txtViewAnswer4ArtificialIntelligence?.setOnClickListener {
            textAnswer4ArtificialIntelligence.visibility = if (textAnswer4ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        txtViewAnswer5ArtificialIntelligence?.setOnClickListener {
            textAnswer5ArtificialIntelligence.visibility = if (textAnswer5ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }


        txtViewAnswer6ArtificialIntelligence?.setOnClickListener {
            textAnswer6ArtificialIntelligence.visibility = if (textAnswer6ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        txtViewAnswer7ArtificialIntelligence?.setOnClickListener {
            textAnswer7ArtificialIntelligence.visibility = if (textAnswer7ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        txtViewAnswer8ArtificialIntelligence?.setOnClickListener {
            textAnswer8ArtificialIntelligence.visibility = if (textAnswer8ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        txtViewAnswer9ArtificialIntelligence?.setOnClickListener {
            textAnswer9ArtificialIntelligence.visibility = if (textAnswer9ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        txtViewAnswer10ArtificialIntelligence?.setOnClickListener {
            textAnswer10ArtificialIntelligence.visibility = if (textAnswer10ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        txtViewAnswer11ArtificialIntelligence.setOnClickListener {
            textAnswer11ArtificialIntelligence.visibility = if (textAnswer11ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer12ArtificialIntelligence.setOnClickListener {
            textAnswer12ArtificialIntelligence.visibility = if (textAnswer12ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer13ArtificialIntelligence.setOnClickListener {
            textAnswer13ArtificialIntelligence.visibility = if (textAnswer13ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer14ArtificialIntelligence.setOnClickListener {
            textAnswer14ArtificialIntelligence.visibility = if (textAnswer14ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer15ArtificialIntelligence.setOnClickListener {
            textAnswer15ArtificialIntelligence.visibility = if (textAnswer15ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer16ArtificialIntelligence.setOnClickListener {
            textAnswer16ArtificialIntelligence.visibility = if (textAnswer16ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer17ArtificialIntelligence.setOnClickListener {
            textAnswer17ArtificialIntelligence.visibility = if (textAnswer17ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer18ArtificialIntelligence.setOnClickListener {
            textAnswer18ArtificialIntelligence.visibility = if (textAnswer18ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer19ArtificialIntelligence.setOnClickListener {
            textAnswer19ArtificialIntelligence.visibility = if (textAnswer19ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        txtViewAnswer20ArtificialIntelligence.setOnClickListener {
            textAnswer20ArtificialIntelligence.visibility = if (textAnswer20ArtificialIntelligence.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        radioGroup1ArtificialIntelligence?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->
            
            if(checkedId==R.id.radioButton4ArtificialIntelligence){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup2ArtificialIntelligence?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

           

            if(checkedId==R.id.radioButton8ArtificialIntelligence){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup3ArtificialIntelligence?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

         

            if(checkedId==R.id.radioButton11ArtificialIntelligence){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup4ArtificialIntelligence?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

           

            if(checkedId==R.id.radioButton16ArtificialIntelligence){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup5ArtificialIntelligence?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

           

            if(checkedId==R.id.radioButton20ArtificialIntelligence){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup6ArtificialIntelligence?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

           

            if(checkedId==R.id.radioButton23ArtificialIntelligence){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup7ArtificialIntelligence?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

          

            if(checkedId==R.id.radioButton25ArtificialIntelligence){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup8ArtificialIntelligence?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            

            if(checkedId==R.id.radioButton29ArtificialIntelligence){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup9ArtificialIntelligence?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            

            if(checkedId==R.id.radioButton34ArtificialIntelligence){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup10ArtificialIntelligence?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            

            if(checkedId==R.id.radioButton37ArtificialIntelligence){
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup11ArtificialIntelligence?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

           
            if (checkedId==R.id.radioButton41ArtificialIntelligence) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup12ArtificialIntelligence.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            
            if (checkedId==R.id.radioButton46ArtificialIntelligence) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        radioGroup13ArtificialIntelligence.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

           
            if (checkedId==R.id.radioButton49ArtificialIntelligence) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        radioGroup14ArtificialIntelligence.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId==R.id.radioButton56ArtificialIntelligence) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        radioGroup15ArtificialIntelligence.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId==R.id.radioButton57ArtificialIntelligence) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        radioGroup16ArtificialIntelligence.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId==R.id.radioButton62ArtificialIntelligence) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        radioGroup17ArtificialIntelligence.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId==R.id.radioButton68ArtificialIntelligence) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        radioGroup18ArtificialIntelligence.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId==R.id.radioButton70ArtificialIntelligence) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        radioGroup19ArtificialIntelligence.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId==R.id.radioButton75ArtificialIntelligence) {
                Snackbar.make(findViewById(android.R.id.content), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(findViewById(android.R.id.content), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        radioGroup20ArtificialIntelligence.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->


            if (checkedId==R.id.radioButton79ArtificialIntelligence) {
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