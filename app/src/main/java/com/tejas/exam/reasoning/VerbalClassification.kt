package com.tejas.exam.reasoning

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.R
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.ActivityVerbalClassificationBinding

class VerbalClassification:AppCompatActivity() {
    
    private lateinit var binding:ActivityVerbalClassificationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerbalClassificationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.txtViewAnswer1VerbalClassification?.setOnClickListener {
            binding.textAnswer1VerbalClassification.visibility = if (binding.textAnswer1VerbalClassification.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer2VerbalClassification?.setOnClickListener {
            binding.textAnswer2VerbalClassification.visibility = if (binding.textAnswer2VerbalClassification.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer3VerbalClassification?.setOnClickListener {
            binding.textAnswer3VerbalClassification.visibility = if (binding.textAnswer3VerbalClassification.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer4VerbalClassification?.setOnClickListener {
            binding.textAnswer4VerbalClassification.visibility = if (binding.textAnswer4VerbalClassification.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer5VerbalClassification?.setOnClickListener {
            binding.textAnswer5VerbalClassification.visibility = if (binding.textAnswer5VerbalClassification.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer6VerbalClassification?.setOnClickListener {
            binding.textAnswer6VerbalClassification.visibility = if (binding.textAnswer6VerbalClassification.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer7VerbalClassification?.setOnClickListener {
            binding.textAnswer7VerbalClassification.visibility = if (binding.textAnswer7VerbalClassification.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer8VerbalClassification?.setOnClickListener {
            binding.textAnswer8VerbalClassification.visibility = if (binding.textAnswer8VerbalClassification.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer9VerbalClassification?.setOnClickListener {
            binding.textAnswer9VerbalClassification.visibility = if (binding.textAnswer9VerbalClassification.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer10VerbalClassification?.setOnClickListener {
            binding.textAnswer10VerbalClassification.visibility = if (binding.textAnswer10VerbalClassification.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        
        //RadioGroup

        binding.radioGroup1VerbalClassification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton4VerbalClassification.isChecked
            if (isChecked) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        binding.radioGroup2VerbalClassification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton6VerbalClassification) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup3VerbalClassification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton12VerbalClassification) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup4VerbalClassification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton15VerbalClassification) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup5VerbalClassification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton17VerbalClassification) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup6VerbalClassification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton23VerbalClassification) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup7VerbalClassification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton28VerbalClassification) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup8VerbalClassification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton31VerbalClassification) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup9VerbalClassification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton36VerbalClassification) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup10VerbalClassification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton38VerbalClassification) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        
    }
}