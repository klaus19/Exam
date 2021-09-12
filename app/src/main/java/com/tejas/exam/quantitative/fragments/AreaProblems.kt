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
import com.tejas.exam.databinding.FragmentAreaProblemsBinding


class AreaProblems : Fragment() {

    private lateinit var binding:FragmentAreaProblemsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_area_problems, container, false)

        binding = FragmentAreaProblemsBinding.inflate(inflater, container, false)

        with(binding){

        }

        binding.txtViewAnswer1Area?.setOnClickListener {
            binding.txtAnswer1Area.visibility = if (binding.txtAnswer1Area.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer2Area?.setOnClickListener {
            binding.txtAnswer2Area.visibility =if (binding.txtAnswer2Area.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer3Area?.setOnClickListener {
            binding.txtAnswer3Area.visibility =if (binding.txtAnswer3Area.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer4Area?.setOnClickListener {
            binding.txtAnswer4Area.visibility =if (binding.txtAnswer4Area.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.textViewAnswer5Area?.setOnClickListener {
            binding.txtAnswer5Area.visibility =if (binding.txtAnswer5Area.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.textViewAnswer6Area?.setOnClickListener {
            binding.txtAnswer6Area.visibility =if (binding.txtAnswer6Area.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.textViewAnswer7Area?.setOnClickListener {
            binding.txtAnswer7Area.visibility = if (binding.txtAnswer7Area.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.textViewAnswer8Area?.setOnClickListener {
            binding.txtAnswer8Area.visibility = if (binding.txtAnswer8Area.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.textViewAnswer9Area?.setOnClickListener {
            binding.txtAnswer9Area.visibility = if (binding.txtAnswer9Area.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.textViewAnswer10Area?.setOnClickListener {
            binding.txtAnswer9Area.visibility = if (binding.txtAnswer9Area.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.radioGroup1Area?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton2Area.isChecked
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
        binding.radioGroup2Area?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton8Area.isChecked
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
        binding.radioGroup3Area?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton10Area.isChecked
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
        binding.radioGroup4Area?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton15Area.isChecked
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
        binding.radioGroup5Area?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton18Area.isChecked
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
        binding.radioGroup6Area?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton23Area.isChecked
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
        binding.radioGroup7Area?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton25Area.isChecked
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
        binding.radioGroup8Area?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton30Area.isChecked
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
        binding.radioGroup9Area?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton36Area.isChecked
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
        binding.radioGroup10Area?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton39Area.isChecked
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