package com.tejas.exam.reasoning

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.R
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.ActivityNumberSeriesBinding

class NumberSeries: AppCompatActivity() {

    private lateinit var binding:ActivityNumberSeriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNumberSeriesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.txtViewAnswer1NumberSeries?.setOnClickListener {
            binding.textAnswer1NumberSeries.visibility = if (binding.textAnswer1NumberSeries.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer2NumberSeries?.setOnClickListener {
            binding.textAnswer2NumberSeries.visibility = if (binding.textAnswer2NumberSeries.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer3NumberSeries?.setOnClickListener {
            binding.textAnswer3NumberSeries.visibility = if (binding.textAnswer3NumberSeries.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer4NumberSeries?.setOnClickListener {
            binding.textAnswer4NumberSeries.visibility = if (binding.textAnswer4NumberSeries.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer5NumberSeries?.setOnClickListener {
            binding.textAnswer5NumberSeries.visibility = if (binding.textAnswer5NumberSeries.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer6NumberSeries?.setOnClickListener {
            binding.textAnswer6NumberSeries.visibility = if (binding.textAnswer6NumberSeries.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer7NumberSeries?.setOnClickListener {
            binding.textAnswer7NumberSeries.visibility = if (binding.textAnswer7NumberSeries.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer8NumberSeries?.setOnClickListener {
            binding.textAnswer8NumberSeries.visibility = if (binding.textAnswer8NumberSeries.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer9NumberSeries?.setOnClickListener {
            binding.textAnswer9NumberSeries.visibility = if (binding.textAnswer9NumberSeries.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer10NumberSeries?.setOnClickListener {
            binding.textAnswer10NumberSeries.visibility = if (binding.textAnswer10NumberSeries.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }

        //RadioBUTTON

        binding.radioGroup1NumberSeries.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton2NumberSeries.isChecked
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

        binding.radioGroup2NumberSeries.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton6NumberSeries) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup3NumberSeries.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton10NumberSeries) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup4NumberSeries.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton15NumberSeries) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup5NumberSeries.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton18NumberSeries) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup6NumberSeries.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton21NumberSeries) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup7NumberSeries.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton26NumberSeries) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup8NumberSeries.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton32NumberSeries) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup9NumberSeries.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton34NumberSeries) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup10NumberSeries.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId==R.id.radioButton37NumberSeries) {
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