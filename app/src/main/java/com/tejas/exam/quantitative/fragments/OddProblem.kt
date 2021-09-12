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
import com.tejas.exam.databinding.FragmentOddProblemBinding


class OddProblem : Fragment() {

    private lateinit var binding:FragmentOddProblemBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_odd_problem, container, false)

        binding= FragmentOddProblemBinding.inflate(inflater,container,false)

//TextView.setOnClickListener

        binding.txtViewAnswer1Odd?.setOnClickListener {
            binding.txtAnswer1Oodd.visibility =if (binding.txtAnswer1Oodd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.txtViewAnswer2Odd?.setOnClickListener {
            binding.txtAnswer2Odd.visibility = if (binding.txtAnswer2Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer3Odd?.setOnClickListener {
            binding.txtAnswer3Odd.visibility = if (binding.txtAnswer3Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer4Odd?.setOnClickListener {
            binding.txtAnswer4Odd.visibility = if (binding.txtAnswer4Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer5Odd?.setOnClickListener {
            binding.txtAnswer5Odd.visibility = if (binding.txtAnswer5Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer6Odd?.setOnClickListener {
            binding.txtAnswer6Odd.visibility = if (binding.txtAnswer6Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer7Odd?.setOnClickListener {
            binding.txtAnswer7Odd.visibility = if (binding.txtAnswer7Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer8Odd?.setOnClickListener {
            binding.txtAnswer8Odd.visibility = if (binding.txtAnswer8Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer9Odd?.setOnClickListener {
            binding.txtAnswer9Odd.visibility = if (binding.txtAnswer9Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer10Odd?.setOnClickListener {
            binding.txtAnswer10Odd.visibility = if (binding.txtAnswer10Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

       
       //Using Scope function 
        with(binding){
            txtViewAnswer11Odd.setOnClickListener {
                textAnswer11Odd.visibility = if (textAnswer11Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer12Odd.setOnClickListener {
                textAnswer12Odd.visibility = if (textAnswer12Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer13Odd.setOnClickListener {
                textAnswer13Odd.visibility = if (textAnswer13Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer14Odd.setOnClickListener {
                textAnswer14Odd.visibility = if (textAnswer14Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer15Odd.setOnClickListener {
                textAnswer15Odd.visibility = if (textAnswer15Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer16Odd.setOnClickListener {
                textAnswer16Odd.visibility = if (textAnswer16Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer17Odd.setOnClickListener {
                textAnswer17Odd.visibility = if (textAnswer17Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer18Odd.setOnClickListener {
                textAnswer18Odd.visibility = if (textAnswer18Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer19Odd.setOnClickListener {
                textAnswer19Odd.visibility = if (textAnswer19Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer20Odd.setOnClickListener {
                textAnswer20Odd.visibility = if (textAnswer20Odd.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }

            radioGroup11Odd.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton41Odd.isChecked
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

            radioGroup12Odd.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton46Odd.isChecked
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
            radioGroup13Odd.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton51Odd.isChecked
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

            radioGroup14Odd.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton54Odd.isChecked
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
            radioGroup15Odd.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton58Odd.isChecked
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
            radioGroup16Odd.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton61Odd.isChecked
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
            radioGroup17Odd.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton65Odd.isChecked
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
            radioGroup18Odd.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton72Odd.isChecked
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
            radioGroup19Odd.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton74Odd.isChecked
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
            radioGroup20Odd.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton79Odd.isChecked
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
        //RadioButton

        binding.radioGroup1Odd?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton3Odd.isChecked
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
        binding.radioGroup2Odd?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton6Odd.isChecked
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

        binding.radioGroup3Odd?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton11Odd.isChecked
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

        binding.radioGroup4Odd?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton15Odd.isChecked
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

        binding.radioGroup5Odd?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton17Odd.isChecked
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

        binding.radioGroup6Odd?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton21Odd.isChecked
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
        binding.radioGroup7Odd?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton27Odd.isChecked
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
        binding.radioGroup8Odd?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton32Odd.isChecked
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
        binding.radioGroup9Odd?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton36Odd.isChecked
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

        binding.radioGroup10Odd?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton39Odd.isChecked
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