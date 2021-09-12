package com.tejas.exam.reasoning

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.ActivityAnalogiesBinding


class Analogies:AppCompatActivity() {

    private lateinit var binding:ActivityAnalogiesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalogiesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.txtViewAnswer1Analogies?.setOnClickListener {
            binding.textAnswer1Analogies.visibility = if (binding.textAnswer1Analogies.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }


        binding.txtViewAnswer2Analogies?.setOnClickListener {
            binding.textAnswer2Analogies.visibility = if (binding.textAnswer2Analogies.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer3Analogies?.setOnClickListener {
            binding.textAnswer3Analogies.visibility = if (binding.textAnswer3Analogies.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer4Analogies?.setOnClickListener {
            binding.textAnswer4Analogies.visibility = if (binding.textAnswer4Analogies.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer5Analogies?.setOnClickListener {
            binding.textAnswer5Analogies.visibility = if ( binding.textAnswer5Analogies.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer6Analogies?.setOnClickListener {
            binding.textAnswer6Analogies.visibility = if ( binding.textAnswer6Analogies.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer7Analogies?.setOnClickListener {
            binding.textAnswer7Analogies.visibility = if ( binding.textAnswer7Analogies.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer8Analogies?.setOnClickListener {
            binding.textAnswer8Analogies.visibility = if ( binding.textAnswer8Analogies.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer9Analogies?.setOnClickListener {
            binding.textAnswer9Analogies.visibility = if ( binding.textAnswer9Analogies.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer10Analogies?.setOnClickListener {
            binding.textAnswer10Analogies.visibility = if ( binding.textAnswer10Analogies.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }


        binding.radioGroup1Analogies?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton4Analogies.isChecked
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

        binding.radioGroup2Analogies?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton6Analogies.isChecked
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
        binding.radioGroup3Analogies?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton10Analogies.isChecked
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
        binding.radioGroup4Analogies?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton14Analogies.isChecked
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
        binding.radioGroup5Analogies?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton17Analogies.isChecked
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
        binding.radioGroup6Analogies?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton23Analogies.isChecked
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
        binding.radioGroup7Analogies?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton26Analogies.isChecked
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
        binding.radioGroup8Analogies?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton31Analogies.isChecked
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
        binding.radioGroup9Analogies?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton35Analogies.isChecked
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
        binding.radioGroup10Analogies?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton40Analogies.isChecked
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