package com.tejas.exam.quantitative.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.R
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.FragmentClockProblemsBinding


class ClockProblems : Fragment() {

    private lateinit var binding:FragmentClockProblemsBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_clock_problems, container, false)
        binding = FragmentClockProblemsBinding.inflate(inflater, container, false)

        //TextView

        binding.textViewAnswer1clock?.setOnClickListener {
            binding.textAnswer1clock.visibility = if (binding.textAnswer1clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer2clock?.setOnClickListener {
            binding.textAnswer2clock.visibility =if (binding.textAnswer2clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer3clock?.setOnClickListener {
            binding.textAnswer3clock.visibility = if (binding.textAnswer3clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer4clock?.setOnClickListener {
            binding.textAnswer4clock.visibility =if (binding.textAnswer4clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer5clock?.setOnClickListener {
            binding.textAnswer5clock.visibility =if (binding.textAnswer5clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer6clock?.setOnClickListener {
            binding.textAnswer6clock.visibility =if (binding.textAnswer6clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer7clock?.setOnClickListener {
            binding.textAnswer7clock.visibility =if (binding.textAnswer7clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer8clock?.setOnClickListener {
            binding.textAnswer8clock.visibility = if (binding.textAnswer8clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer9clock?.setOnClickListener {
            binding.textAnswer9clock.visibility =if (binding.textAnswer9clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer10clock?.setOnClickListener {
            binding.textAnswer10clock.visibility = if (binding.textAnswer10clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        
        //Using Kotlin Scope function With() 
        
        with(binding){
            txtViewAnswer11clock.setOnClickListener {
                textAnswer11clock.visibility = if (textAnswer11clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer12clock.setOnClickListener {
                textAnswer12clock.visibility = if (textAnswer12clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer13clock.setOnClickListener {
                textAnswer13clock.visibility = if (textAnswer13clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer14clock.setOnClickListener {
                textAnswer14clock.visibility = if (textAnswer14clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer15clock.setOnClickListener {
                textAnswer15clock.visibility = if (textAnswer15clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer16clock.setOnClickListener {
                textAnswer16clock.visibility = if (textAnswer16clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer17clock.setOnClickListener {
                textAnswer17clock.visibility = if (textAnswer17clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer18clock.setOnClickListener {
                textAnswer18clock.visibility = if (textAnswer18clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer19clock.setOnClickListener {
                textAnswer19clock.visibility = if (textAnswer19clock.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            //RadioButton.OnClick

            radioGroup11clock.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton43clock.isChecked
                if (isChecked) {
                    Snackbar.make(root, "Correct", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(0, 128, 0))
                        .show()

                } else {
                    Snackbar.make(root, "InCorrect", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(255, 0, 0))
                        .show()
                }
            })

            radioGroup12clock.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton46clock.isChecked
                if (isChecked) {
                    Snackbar.make(root, "Correct", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(0, 128, 0))
                        .show()

                } else {
                    Snackbar.make(root, "InCorrect", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(255, 0, 0))
                        .show()
                }
            })
            radioGroup13clock.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton50clock.isChecked
                if (isChecked) {
                    Snackbar.make(root, "Correct", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(0, 128, 0))
                        .show()

                } else {
                    Snackbar.make(root, "InCorrect", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(255, 0, 0))
                        .show()
                }
            })

            radioGroup14clock.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton56clock.isChecked
                if (isChecked) {
                    Snackbar.make(root, "Correct", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(0, 128, 0))
                        .show()

                } else {
                    Snackbar.make(root, "InCorrect", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(255, 0, 0))
                        .show()
                }
            })
            radioGroup15clock.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton59clock.isChecked
                if (isChecked) {
                    Snackbar.make(root, "Correct", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(0, 128, 0))
                        .show()

                } else {
                    Snackbar.make(root, "InCorrect", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(255, 0, 0))
                        .show()
                }
            })
            radioGroup16clock.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton64clock.isChecked
                if (isChecked) {
                    Snackbar.make(root, "Correct", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(0, 128, 0))
                        .show()

                } else {
                    Snackbar.make(root, "InCorrect", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(255, 0, 0))
                        .show()
                }
            })
            radioGroup17clock.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton67clock.isChecked
                if (isChecked) {
                    Snackbar.make(root, "Correct", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(0, 128, 0))
                        .show()

                } else {
                    Snackbar.make(root, "InCorrect", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(255, 0, 0))
                        .show()
                }
            })
            radioGroup18clock.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton71clock.isChecked
                if (isChecked) {
                    Snackbar.make(root, "Correct", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(0, 128, 0))
                        .show()

                } else {
                    Snackbar.make(root, "InCorrect", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(255, 0, 0))
                        .show()
                }
            })
            radioGroup19clock.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton74clock.isChecked
                if (isChecked) {
                    Snackbar.make(root, "Correct", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(0, 128, 0))
                        .show()

                } else {
                    Snackbar.make(root, "InCorrect", Snackbar.LENGTH_LONG)
                        .withColor(Color.rgb(255, 0, 0))
                        .show()
                }
            })
        }

        //Radio Button

        binding.radioGroup1clock?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton4clock.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)

                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }


        })
        binding.radioGroup2clock?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton8clock.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)

                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }


        })
        binding.radioGroup3clock?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton11clock.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)

                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }


        })
        binding.radioGroup4clock?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton14clock.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)

                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }

        })
        binding.radioGroup5clock?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton17clock.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)

                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }


        })
        binding.radioGroup6clock?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton22clock.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)

                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }


        })
        binding.radioGroup7clock?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton27clock.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)

                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }

        })
        binding.radioGroup8clock?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton31clock.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)

                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }


        })
        binding.radioGroup9clock?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton34clock.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)

                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }


        })
        binding.radioGroup10clock?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton38clock.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)

                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }


        })


        return binding.root
    }


}