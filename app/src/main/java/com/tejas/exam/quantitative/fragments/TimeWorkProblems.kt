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
import com.tejas.exam.databinding.FragmentTimeWorkProblemsBinding

class TimeWorkProblems : Fragment() {

    private lateinit var binding: FragmentTimeWorkProblemsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_time_work_problems, container, false)

        binding= FragmentTimeWorkProblemsBinding.inflate(inflater, container, false)

        binding.txtViewAnswer1TimeWork?.setOnClickListener {
            binding.textAnswer1TimeWork.visibility =
            if ( binding.textAnswer1TimeWork.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer2TimeWork?.setOnClickListener {
            binding.textAnswer2TimeWork.visibility =
            if (binding.textAnswer2TimeWork.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer3TimeWork?.setOnClickListener {
            binding.textAnswer3TimeWork.visibility =
            if (binding.textAnswer3TimeWork.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer4TimeWork?.setOnClickListener {
            binding.textAnswer4TimeWork.visibility =
            if (binding.textAnswer4TimeWork.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer5TimeWork?.setOnClickListener {
            binding.textAnswer5TimeWork.visibility =
            if (binding.textAnswer5TimeWork.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer6TimeWork?.setOnClickListener {
            binding.textAnswer6TimeWork.visibility =
            if (binding.textAnswer6TimeWork.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer7TimeWork?.setOnClickListener {
            binding.textAnswer7TimeWork.visibility =
            if (binding.textAnswer7TimeWork.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer8TimeWork?.setOnClickListener {
            binding.textAnswer8TimeWork.visibility =
            if (binding.textAnswer8TimeWork.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer9TimeWork?.setOnClickListener {
            binding.textAnswer9TimeWork.visibility =
            if (binding.textAnswer9TimeWork.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer10TimeWork?.setOnClickListener {
            binding.textAnswer10TimeWork.visibility =
            if (binding.textAnswer10TimeWork.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        //radio buttons

        binding.radioGroup1TimeWork?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton3TimeWork.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        0,
                        128,
                        0
                    )
                ).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        255,
                        0,
                        0
                    )
                ).show()
            }

        })
        binding.radioGroup2TimeWork?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton7TimeWork.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        0,
                        128,
                        0
                    )
                ).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        255,
                        0,
                        0
                    )
                ).show()
            }

        })

        binding.radioGroup3TimeWork?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton11TimeWork.isChecked

            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        0,
                        128,
                        0
                    )
                ).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        255,
                        0,
                        0
                    )
                ).show()
            }
        })
        binding.radioGroup4TimeWork?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton14TimeWork.isChecked

            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        0,
                        128,
                        0
                    )
                ).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        255,
                        0,
                        0
                    )
                ).show()
            }
        })

        binding.radioGroup5TimeWork?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton19TimeWork.isChecked

            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        0,
                        128,
                        0
                    )
                ).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        255,
                        0,
                        0
                    )
                ).show()
            }
        })
        binding.radioGroup6TimeWork?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton22TimeWork.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        0,
                        128,
                        0
                    )
                ).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        255,
                        0,
                        0
                    )
                ).show()
            }
        })
        binding.radioGroup7TimeWork?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton28TimeWork.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        0,
                        128,
                        0
                    )
                ).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        255,
                        0,
                        0
                    )
                ).show()
            }
        })
        binding.radioGroup8TimeWork?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton29TimeWork.isChecked

            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        0,
                        128,
                        0
                    )
                ).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        255,
                        0,
                        0
                    )
                ).show()
            }
        })
        binding.radioGroup9TimeWork?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton33TimeWork.isChecked

            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        0,
                        128,
                        0
                    )
                ).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        255,
                        0,
                        0
                    )
                ).show()
            }
        })
        binding.radioGroup10TimeWork?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton40TimeWork.isChecked

            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        0,
                        128,
                        0
                    )
                ).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(
                    Color.rgb(
                        255,
                        0,
                        0
                    )
                ).show()
            }
        })



        return binding.root

    }


}