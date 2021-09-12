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
import com.tejas.exam.databinding.FragmentAgesProblemsBinding


class AgesProblems : Fragment() {

    private lateinit var binding: FragmentAgesProblemsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_ages_problems, container, false)

        binding = FragmentAgesProblemsBinding.inflate(inflater, container, false)

        binding.textViewAnswer1AgeProblems?.setOnClickListener {
            binding.textAnswer1AgeProblems.visibility =
                if (binding.textAnswer1AgeProblems.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer2AgeProblems?.setOnClickListener {
            binding.textAnswer2AgeProblems.visibility =
                if (binding.textAnswer2AgeProblems.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer3AgeProblems?.setOnClickListener {
            binding.textAnswer3AgeProblems.visibility =
                if (binding.textAnswer3AgeProblems.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer4AgeProblems?.setOnClickListener {
            binding.textAnswer4AgeProblems.visibility =
                if (binding.textAnswer4AgeProblems.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE }

        binding.textViewAnswer5AgeProblems?.setOnClickListener {
            binding.textAnswer5AgeProblems.visibility =
                    if (binding.textAnswer5AgeProblems.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
        binding.textViewAnswer6AgeProblems?.setOnClickListener {
            binding.textAnswer6AgeProblems.visibility =
                    if (binding.textAnswer6AgeProblems.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
        binding.textViewAnswer7AgeProblems?.setOnClickListener {
            binding.textAnswer7AgeProblems.visibility =
                    if (binding.textAnswer7AgeProblems.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
        binding.textViewAnswer8AgeProblems?.setOnClickListener {
            binding.textAnswer8AgeProblems.visibility =
                    if (binding.textAnswer8AgeProblems.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
        binding.textViewAnswer9AgeProblems?.setOnClickListener {
            binding.textAnswer9AgeProblems.visibility =
                    if (binding.textAnswer9AgeProblems.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
        binding.textViewAnswer10AgeProblems?.setOnClickListener {
            binding.textAnswer10AgeProblems.visibility =
                    if (binding.textAnswer10AgeProblems.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }

        //Radio group with

        binding.radioGroup1AgeProblems?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton1AgeProblems.isChecked
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
        binding.radioGroup2AgeProblems?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton5AgeProblems.isChecked
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
        binding.radioGroup3AgeProblems?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton9AgeProblems.isChecked
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
        binding.radioGroup4AgeProblems?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton16AgeProblems.isChecked
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
        binding.radioGroup5AgeProblems?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton17AgeProblems.isChecked
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
        binding.radioGroup6AgeProblems?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton24AgeProblems.isChecked
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
        binding.radioGroup7AgeProblems?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton25AgeProblems.isChecked
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

        binding.radioGroup8AgeProblems?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton32AgeProblems.isChecked
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
        binding.radioGroup9AgeProblems?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton36AgeProblems.isChecked
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
        binding.radioGroup10AgeProblems?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked = binding.radioButton39AgeProblems.isChecked
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