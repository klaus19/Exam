package com.tejas.exam.quantitative.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.Toast
import androidx.annotation.ColorInt
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.R
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.FragmentSimplificationProblemBinding
import com.tejas.exam.databinding.SimplificationBinding


class SimplificationProblem : Fragment() {

    private lateinit var binding:FragmentSimplificationProblemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      //  return inflater.inflate(R.layout.fragment_simplification_problem, container, false)

        binding= FragmentSimplificationProblemBinding.inflate(inflater, container, false)

        binding.txtViewAnswer1Simplification?.setOnClickListener {
            binding.txtAnswer1Simplification.visibility= if (binding.txtAnswer1Simplification.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE

        }
        binding.txtViewAnswer2Simplification?.setOnClickListener {
           binding.txtAnswer2Simplification.visibility= if (binding.txtAnswer2Simplification.visibility == View.INVISIBLE)
               View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer3Simplification?.setOnClickListener {
            binding.txtAnswer3Simplification.visibility=if (binding.txtAnswer3Simplification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer4Simplification?.setOnClickListener {
            binding.txtAnswer4Simplification.visibility=if (binding.txtAnswer4Simplification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer5Simplification?.setOnClickListener {
            binding.txtAnswer5Simplification.visibility=if (binding.txtAnswer5Simplification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.textViewAnswer6Simplification?.setOnClickListener {
            binding.txtAnswer6Simplification.visibility=if (binding.txtAnswer6Simplification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer7Simplification?.setOnClickListener {
            binding.txtAnswer7Simplification.visibility=if (binding.txtAnswer7Simplification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer8Simplification?.setOnClickListener {
            binding.txtAnswer8Simplification.visibility=if (binding.txtAnswer8Simplification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer9Simplification?.setOnClickListener {
            binding.txtAnswer9Simplification.visibility= if (binding.txtAnswer9Simplification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.textViewAnswer10Simplification?.setOnClickListener {
            binding.txtAnswer10Simplification.visibility=if (binding.txtAnswer10Simplification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        with(binding){
            txtViewAnswer11Simplification.setOnClickListener {
                textAnswer11Simplification.visibility = if (textAnswer11Simplification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer12Simplification.setOnClickListener {
                textAnswer12Simplification.visibility = if (textAnswer12Simplification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer13Simplification.setOnClickListener {
                textAnswer13Simplification.visibility = if (textAnswer13Simplification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer14Simplification.setOnClickListener {
                textAnswer14Simplification.visibility = if (textAnswer14Simplification.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }

            radioGroup11Simplification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton42Simplification.isChecked
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

            radioGroup12Simplification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton47Simplification.isChecked
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
            radioGroup13Simplification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton52Simplification.isChecked
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

            radioGroup14Simplification.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton55Simplification.isChecked
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
        
        
        
        binding.radioGroup1Simplification?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton4Simplification.isChecked
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

        binding.radioGroup2Simplification?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton7Simplification.isChecked
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
        binding.radioGroup3Simplification?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton12Simplification.isChecked
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
        binding.radioGroup4Simplification?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton13Simplification.isChecked
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
        binding.radioGroup5Simplification?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton18Simplification.isChecked
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
        binding.radioGroup6Simplification?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton24Simplification.isChecked
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
        binding.radioGroup7Simplification?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton26Simplification.isChecked
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
        binding.radioGroup8Simplification?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton32Simplification.isChecked
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
        binding.radioGroup9Simplification?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton35Simplification.isChecked
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
        binding.radioGroup10Simplification?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton39Simplification.isChecked

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

    //Snackbar colours code

    fun Snackbar.withColor(@ColorInt colorInt:Int): Snackbar {
        this.view.setBackgroundColor(colorInt)
        return this
    }

}