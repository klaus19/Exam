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
import com.tejas.exam.databinding.FragmentPartnershipProblemsBinding


class PartnershipProblems : Fragment() {

    private lateinit var binding:FragmentPartnershipProblemsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_partnership_problems, container, false)
        binding = FragmentPartnershipProblemsBinding.inflate(inflater, container, false)

        // textview.text
        binding.textViewAnswer1Partnership?.setOnClickListener {
            binding.textAnswer1Partnership.visibility = if (binding.textAnswer1Partnership.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.textViewAnswer2Partnership?.setOnClickListener {
            binding.textAnswer2Partnership.visibility =if (binding.textAnswer2Partnership.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.textViewAnswer3Partnership?.setOnClickListener {
            binding.textAnswer3Partnership.visibility =if (binding.textAnswer3Partnership.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer4Partnership?.setOnClickListener {
            binding.textAnswer4Partnership.visibility =if (binding.textAnswer4Partnership.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer5Partnership?.setOnClickListener {
            binding.textAnswer5Partnership.visibility =if (binding.textAnswer5Partnership.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer6Partnership?.setOnClickListener {
            binding.textAnswer6Partnership.visibility =if (binding.textAnswer6Partnership.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer7Partnership?.setOnClickListener {
            binding.textAnswer7Partnership.visibility =if (binding.textAnswer7Partnership.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer8Partnership?.setOnClickListener {
            binding.textAnswer8Partnership.visibility = if (binding.textAnswer8Partnership.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer9Partnership?.setOnClickListener {
            binding.textAnswer9Partnership.visibility = if (binding.textAnswer9Partnership.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

//RadioButton.OnClickListener
        binding.radioGroup1Partnership?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked =  binding.radioButton2Partnership.isChecked

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
        binding.radioGroup2Partnership?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val isChecked =  binding.radioButton6Partnership.isChecked
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
        binding.radioGroup3Partnership?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  binding.radioButton12Partnership.isChecked
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
        binding.radioGroup4Partnership?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  binding.radioButton14Partnership.isChecked
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
        binding.radioGroup5Partnership?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  binding.radioButton20Partnership.isChecked
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
        binding.radioGroup6Partnership?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  binding.radioButton24Partnership.isChecked
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
        binding.radioGroup7Partnership?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  binding.radioButton28Partnership.isChecked
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
        binding.radioGroup8Partnership?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  binding.radioButton32Partnership.isChecked
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
        binding.radioGroup9Partnership?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  binding.radioButton34Partnership.isChecked
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