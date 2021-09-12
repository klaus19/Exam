package com.tejas.exam.technical

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.ActivityElectricCircuitsBinding


class ElectricCircuits: AppCompatActivity() {

    private lateinit var binding:ActivityElectricCircuitsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityElectricCircuitsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.txtViewAnswer1ElectricCircuits?.setOnClickListener {
            binding.textAnswer1ElectricCircuits.visibility = if (binding.textAnswer1ElectricCircuits.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }


        binding.txtViewAnswer2ElectricCircuits?.setOnClickListener {
            binding.textAnswer2ElectricCircuits.visibility = if (binding.textAnswer2ElectricCircuits.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer3ElectricCircuits?.setOnClickListener {
            binding.textAnswer3ElectricCircuits.visibility = if (binding.textAnswer3ElectricCircuits.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer4ElectricCircuits?.setOnClickListener {
            binding.textAnswer4ElectricCircuits.visibility = if (binding.textAnswer4ElectricCircuits.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer5ElectricCircuits?.setOnClickListener {
            binding.textAnswer5ElectricCircuits.visibility = if ( binding.textAnswer5ElectricCircuits.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer6ElectricCircuits?.setOnClickListener {
            binding.textAnswer6ElectricCircuits.visibility = if ( binding.textAnswer6ElectricCircuits.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer7ElectricCircuits?.setOnClickListener {
            binding.textAnswer7ElectricCircuits.visibility = if ( binding.textAnswer7ElectricCircuits.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer8ElectricCircuits?.setOnClickListener {
            binding.textAnswer8ElectricCircuits.visibility = if ( binding.textAnswer8ElectricCircuits.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer9ElectricCircuits?.setOnClickListener {
            binding.textAnswer9ElectricCircuits.visibility = if ( binding.textAnswer9ElectricCircuits.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer10ElectricCircuits?.setOnClickListener {
            binding.textAnswer10ElectricCircuits.visibility = if ( binding.textAnswer10ElectricCircuits.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }


        binding.radioGroup1ElectricCircuits?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton1ElectricCircuits.isChecked
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

        binding.radioGroup2ElectricCircuits?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton7ElectricCircuits.isChecked
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
        binding.radioGroup3ElectricCircuits?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton12ElectricCircuits.isChecked
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
        binding.radioGroup4ElectricCircuits?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton15ElectricCircuits.isChecked
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
        binding.radioGroup5ElectricCircuits?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton17ElectricCircuits.isChecked
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
        binding.radioGroup6ElectricCircuits?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton21ElectricCircuits.isChecked
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
        binding.radioGroup7ElectricCircuits?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton25ElectricCircuits.isChecked
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
        binding.radioGroup8ElectricCircuits?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton32ElectricCircuits.isChecked
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
        binding.radioGroup9ElectricCircuits?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton35ElectricCircuits.isChecked
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
        binding.radioGroup10ElectricCircuits?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton38ElectricCircuits.isChecked
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