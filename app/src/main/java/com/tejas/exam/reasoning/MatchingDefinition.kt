package com.tejas.exam.reasoning

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.R
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.ActivityMatchingDefintionBinding


class MatchingDefinition:AppCompatActivity() {

      private lateinit var binding:ActivityMatchingDefintionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMatchingDefintionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //TextView


        binding.txtViewAnswer1MatchingDefintion?.setOnClickListener {
            binding.textAnswer1MatchingDefintion.visibility = if (binding.textAnswer1MatchingDefintion.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer2MatchingDefintion?.setOnClickListener {
            binding.textAnswer2MatchingDefintion.visibility = if (binding.textAnswer2MatchingDefintion.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer3MatchingDefintion?.setOnClickListener {
            binding.textAnswer3MatchingDefintion.visibility = if (binding.textAnswer3MatchingDefintion.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer4MatchingDefintion?.setOnClickListener {
            binding.textAnswer4MatchingDefintion.visibility = if (binding.textAnswer4MatchingDefintion.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer5MatchingDefintion?.setOnClickListener {
            binding.textAnswer5MatchingDefintion.visibility = if (binding.textAnswer5MatchingDefintion.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer6MatchingDefintion?.setOnClickListener {
            binding.textAnswer6MatchingDefintion.visibility = if (binding.textAnswer6MatchingDefintion.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer7MatchingDefintion?.setOnClickListener {
            binding.textAnswer7MatchingDefintion.visibility = if (binding.textAnswer7MatchingDefintion.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer8MatchingDefintion?.setOnClickListener {
            binding.textAnswer8MatchingDefintion.visibility = if (binding.textAnswer8MatchingDefintion.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer9MatchingDefintion?.setOnClickListener {
            binding.textAnswer9MatchingDefintion.visibility = if (binding.textAnswer9MatchingDefintion.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer10MatchingDefintion?.setOnClickListener {
            binding.textAnswer10MatchingDefintion.visibility = if (binding.textAnswer10MatchingDefintion.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        
        //RadioButton

        binding.radioGroup1MatchingDefintion.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton3MatchingDefintion) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        binding.radioGroup2MatchingDefintion.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton6MatchingDefintion) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup3MatchingDefintion.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton9MatchingDefintion) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup4MatchingDefintion.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton16MatchingDefintion) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup5MatchingDefintion.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton17MatchingDefintion) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup6MatchingDefintion.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton24MatchingDefintion) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup7MatchingDefintion.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton28MatchingDefintion) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup8MatchingDefintion.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton29MatchingDefintion) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup9MatchingDefintion.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton34MatchingDefintion) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup10MatchingDefintion.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton38MatchingDefintion) {
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