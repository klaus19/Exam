package com.tejas.exam.reasoning

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.R
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.ActivityLogicalProblemsBinding

class LogicalProblems:AppCompatActivity() {
    
    private lateinit var binding:ActivityLogicalProblemsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLogicalProblemsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.txtViewAnswer1LogicalProblems?.setOnClickListener {
            binding.textAnswer1LogicalProblems.visibility = if (binding.textAnswer1LogicalProblems.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer2LogicalProblems?.setOnClickListener {
            binding.textAnswer2LogicalProblems.visibility = if (binding.textAnswer2LogicalProblems.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer3LogicalProblems?.setOnClickListener {
            binding.textAnswer3LogicalProblems.visibility = if (binding.textAnswer3LogicalProblems.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer4LogicalProblems?.setOnClickListener {
            binding.textAnswer4LogicalProblems.visibility = if (binding.textAnswer4LogicalProblems.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer5LogicalProblems?.setOnClickListener {
            binding.textAnswer5LogicalProblems.visibility = if (binding.textAnswer5LogicalProblems.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer6LogicalProblems?.setOnClickListener {
            binding.textAnswer6LogicalProblems.visibility = if (binding.textAnswer6LogicalProblems.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer7LogicalProblems?.setOnClickListener {
            binding.textAnswer7LogicalProblems.visibility = if (binding.textAnswer7LogicalProblems.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer8LogicalProblems?.setOnClickListener {
            binding.textAnswer8LogicalProblems.visibility = if (binding.textAnswer8LogicalProblems.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer9LogicalProblems?.setOnClickListener {
            binding.textAnswer9LogicalProblems.visibility = if (binding.textAnswer9LogicalProblems.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer10LogicalProblems?.setOnClickListener {
            binding.textAnswer10LogicalProblems.visibility = if (binding.textAnswer10LogicalProblems.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }

//RadioButton 
        binding.radioGroup1LogicalProblems.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton1LogicalProblems.isChecked
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

        binding.radioGroup2LogicalProblems.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton6LogicalProblems) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup3LogicalProblems.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton10LogicalProblems) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup4LogicalProblems.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton15LogicalProblems) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup5LogicalProblems.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton19LogicalProblems) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup6LogicalProblems.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton21LogicalProblems) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup7LogicalProblems.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton28LogicalProblems) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup8LogicalProblems.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton30LogicalProblems) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup9LogicalProblems.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton34LogicalProblems) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup10LogicalProblems.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton37LogicalProblems) {
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