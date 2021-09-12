package com.tejas.exam.verbal

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.ActivitySittingarrangementBinding


class SittingArrangement:AppCompatActivity() {
    private lateinit var binding:ActivitySittingarrangementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySittingarrangementBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.txtViewAnswer1SittingArrangement.setOnClickListener {
            binding.textAnswer1SittingArrangement.visibility = if (binding.textAnswer1SittingArrangement.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer2SittingArrangement.setOnClickListener {
            binding.textAnswer2SittingArrangement.visibility = if (binding.textAnswer2SittingArrangement.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer3SittingArrangement.setOnClickListener {
            binding.textAnswer3SittingArrangement.visibility = if (binding.textAnswer3SittingArrangement.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer4SittingArrangement.setOnClickListener {
            binding.textAnswer4SittingArrangement.visibility = if (binding.textAnswer4SittingArrangement.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer5SittingArrangement.setOnClickListener {
            binding.textAnswer5SittingArrangement.visibility = if (binding.textAnswer5SittingArrangement.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer6SittingArrangement.setOnClickListener {
            binding.textAnswer6SittingArrangement.visibility = if (binding.textAnswer6SittingArrangement.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer7SittingArrangement.setOnClickListener {
            binding.textAnswer7SittingArrangement.visibility = if (binding.textAnswer7SittingArrangement.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer8SittingArrangement.setOnClickListener {
            binding.textAnswer8SittingArrangement.visibility = if (binding.textAnswer8SittingArrangement.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer9SittingArrangement.setOnClickListener {
            binding.textAnswer9SittingArrangement.visibility = if (binding.textAnswer9SittingArrangement.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer10SittingArrangement.setOnClickListener {
            binding.textAnswer10SittingArrangement.visibility = if (binding.textAnswer10SittingArrangement.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }




        binding.radioGroup1SittingArrangement.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton2SittingArrangement.isChecked
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

        binding.radioGroup2SittingArrangement.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton7SittingArrangement.isChecked
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

        binding.radioGroup3SittingArrangement.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton10SittingArrangement.isChecked
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

        binding.radioGroup4SittingArrangement.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton15SittingArrangement.isChecked
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

        binding.radioGroup5SittingArrangement.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton18SittingArrangement.isChecked
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

        binding.radioGroup6SittingArrangement.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton23SittingArrangement.isChecked
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

        binding.radioGroup7SittingArrangement.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton28SittingArrangement.isChecked

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

        binding.radioGroup8SittingArrangement.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton32SittingArrangement.isChecked
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

        binding.radioGroup9SittingArrangement.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton33SittingArrangement.isChecked
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

        binding.radioGroup10SittingArrangement.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton39SittingArrangement.isChecked
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