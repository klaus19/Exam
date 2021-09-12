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
import com.tejas.exam.databinding.FragmentTimeDistanceProblemsBinding


class TimeDistanceProblems : Fragment() {

    private lateinit var binding:FragmentTimeDistanceProblemsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_time_distance_problems, container, false)

        binding = FragmentTimeDistanceProblemsBinding.inflate(inflater,container,false)

//text.setOnClickListener

        binding.txtViewAnswer1TimeDistance?.setOnClickListener {


            binding.txtAnswer1TimeDistance.visibility =if (binding.txtAnswer1TimeDistance.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer2TimeDistance?.setOnClickListener {


            binding.txtAnswer2TimeDistance.visibility =   if (binding.txtAnswer2TimeDistance.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer3TimeDistance?.setOnClickListener {


            binding.txtAnswer3TimeDistance.visibility =  if (binding.txtAnswer3TimeDistance.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer4TimeDistance?.setOnClickListener {


            binding.txtAnswer4TimeDistance.visibility = if (binding.txtAnswer4TimeDistance.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer5TimeDistance?.setOnClickListener {


            binding.txtAnswer5TimeDistance.visibility = if (binding.txtAnswer5TimeDistance.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer6TimeDistance?.setOnClickListener {


            binding.txtAnswer6TimeDistance.visibility = if (binding.txtAnswer6TimeDistance.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer7TimeDistance?.setOnClickListener {


            binding.txtAnswer7TimeDistance.visibility = if (binding.txtAnswer7TimeDistance.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer8TimeDistance?.setOnClickListener {


            binding.txtAnswer8TimeDistance.visibility =   if ( binding.txtAnswer8TimeDistance.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer9TimeDistance?.setOnClickListener {


            binding.txtAnswer9TimeDistance.visibility = if ( binding.txtAnswer9TimeDistance.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer10TimeDistance?.setOnClickListener {


            binding.txtAnswer10TimeDistance.visibility = if ( binding.txtAnswer10TimeDistance.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        //RadioGroup


        binding.radioGroup1TimeDistance?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton2TimeDistance.isChecked
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
        binding.radioGroup2TimeDistance?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton8TimeDistance.isChecked
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
        binding.radioGroup3TimeDistance?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton9TimeDistance.isChecked

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
        binding.radioGroup4TimeDistance?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton15TimeDistance.isChecked

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
        binding.radioGroup5TimeDistance?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton18TimeDistance.isChecked
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
        binding.radioGroup6TimeDistance?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton21TimeDistance.isChecked
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
        binding.radioGroup7TimeDistance?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton26TimeDistance.isChecked
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
        binding.radioGroup8TimeDistance?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton32TimeDistance.isChecked
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
        binding.radioGroup9TimeDistance?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton35TimeDistance.isChecked
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
        binding.radioGroup10TimeDistance?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton40TimeDistance.isChecked
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