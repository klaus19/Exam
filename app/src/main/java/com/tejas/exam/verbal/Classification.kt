package com.tejas.exam.verbal

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.ActivityClassificationBinding


class Classification:AppCompatActivity() {
    
    private lateinit var binding:ActivityClassificationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityClassificationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.txtViewAnswer1Classification.setOnClickListener {
            binding.textAnswer1Classification.visibility = if (binding.textAnswer1Classification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer2Classification.setOnClickListener {
            binding.textAnswer2Classification.visibility = if (binding.textAnswer2Classification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer3Classification.setOnClickListener {
            binding.textAnswer3Classification.visibility = if (binding.textAnswer3Classification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer4Classification.setOnClickListener {
            binding.textAnswer4Classification.visibility = if (binding.textAnswer4Classification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer5Classification.setOnClickListener {
            binding.textAnswer5Classification.visibility = if (binding.textAnswer5Classification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer6Classification.setOnClickListener {
            binding.textAnswer6Classification.visibility = if (binding.textAnswer6Classification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer7Classification.setOnClickListener {
            binding.textAnswer7Classification.visibility = if (binding.textAnswer7Classification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer8Classification.setOnClickListener {
            binding.textAnswer8Classification.visibility = if (binding.textAnswer8Classification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer9Classification.setOnClickListener {
            binding.textAnswer9Classification.visibility = if (binding.textAnswer9Classification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer10Classification.setOnClickListener {
            binding.textAnswer10Classification.visibility = if (binding.textAnswer10Classification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }




        binding.radioGroup1Classification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton1Classification.isChecked
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

        binding.radioGroup2Classification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton8Classification.isChecked
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

        binding.radioGroup3Classification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton10Classification.isChecked
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

        binding.radioGroup4Classification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton16Classification.isChecked
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

        binding.radioGroup5Classification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton19Classification.isChecked
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

        binding.radioGroup6Classification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton21Classification.isChecked
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

        binding.radioGroup7Classification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton28Classification.isChecked

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

        binding.radioGroup8Classification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton32Classification.isChecked
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

        binding.radioGroup9Classification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton34Classification.isChecked
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

        binding.radioGroup10Classification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton40Classification.isChecked
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

    }
}