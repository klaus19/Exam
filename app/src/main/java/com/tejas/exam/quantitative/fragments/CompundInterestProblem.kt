package com.tejas.exam.quantitative.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.FragmentCompundInterestProblemBinding


class CompundInterestProblem : Fragment() {

    private lateinit var binding: FragmentCompundInterestProblemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_compund_interest_problem, container, false)

        binding = FragmentCompundInterestProblemBinding.inflate(inflater,container,false)

        //Textview view

        binding.textViewAnswer1CompoundInterest?.setOnClickListener {
            binding.textAnswer1CompoundInterest.visibility =
            if (binding.textAnswer1CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.textViewAnswer2CompoundInterest?.setOnClickListener {
            binding.textAnswer2CompoundInterest.visibility =
            if (binding.textAnswer2CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer3CompoundInterest?.setOnClickListener {
            binding.textAnswer3CompoundInterest.visibility =
            if (binding.textAnswer3CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer4CompoundInterest?.setOnClickListener {
            binding.textAnswer4CompoundInterest.visibility =
            if (binding.textAnswer4CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer5CompoundInterest?.setOnClickListener {
            binding.textAnswer5CompoundInterest.visibility =
            if (binding.textAnswer5CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer6CompoundInterest?.setOnClickListener {
            binding.textAnswer6CompoundInterest.visibility =
            if (binding.textAnswer6CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer7CompoundInterest?.setOnClickListener {
            binding.textAnswer7CompoundInterest.visibility =
            if (binding.textAnswer7CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer8CompoundInterest?.setOnClickListener {
            binding.textAnswer8CompoundInterest.visibility =
            if (binding.textAnswer8CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer9CompoundInterest?.setOnClickListener {
            binding.textAnswer9CompoundInterest.visibility =
            if (binding.textAnswer9CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer10CompoundInterest?.setOnClickListener {
            binding.textAnswer10CompoundInterest.visibility =
            if (binding.textAnswer10CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }


//radio button

        binding.radioGroup1CompoundInterest?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton2CompoundInterest.isChecked

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
        binding.radioGroup2CompoundInterest?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton5CompoundInterest.isChecked
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
        binding.radioGroup3CompoundInterest?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton11CompoundInterest.isChecked
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
        binding.radioGroup4CompoundInterest?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton13CompoundInterest.isChecked
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
        binding.radioGroup5CompoundInterest?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton17CompoundInterest.isChecked
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
        binding.radioGroup6CompoundInterest?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton23CompoundInterest.isChecked
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
        binding.radioGroup7CompoundInterest?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton25CompoundInterest.isChecked
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
        binding.radioGroup8CompoundInterest?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton30CompoundInterest.isChecked
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
        binding.radioGroup9CompoundInterest?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton33CompoundInterest.isChecked
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

        binding.radioGroup10CompoundInterest?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton40CompoundInterest.isChecked
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