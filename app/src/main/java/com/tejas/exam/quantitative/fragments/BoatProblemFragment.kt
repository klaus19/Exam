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
import com.tejas.exam.databinding.FragmentBoatProblemBinding


class BoatProblemFragment : Fragment() {

    private lateinit var binding:FragmentBoatProblemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_boat_problem, container, false)

        binding = FragmentBoatProblemBinding.inflate(inflater, container, false)

        binding.txtViewAnswer1Boats?.setOnClickListener {
            binding.textAnswer1Boats.visibility = if (binding.textAnswer1Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer2Boats?.setOnClickListener {
            binding.textAnswer2Boats.visibility= if (binding.textAnswer2Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer3Boats?.setOnClickListener {
            binding.textAnswer3Boats.visibility= if (binding.textAnswer3Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer4Boats?.setOnClickListener {
            binding. textAnswer4Boats.visibility = if (binding.textAnswer4Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer5Boats?.setOnClickListener {
            binding.textAnswer5Boats.visibility = if (binding.textAnswer5Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer6Boats?.setOnClickListener {
            binding. textAnswer6Boats.visibility = if (binding.textAnswer6Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding. txtViewAnswer7Boats?.setOnClickListener {
            binding.textAnswer7Boats.visibility =  if (binding.textAnswer7Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer8Boats?.setOnClickListener {
            binding. textAnswer8Boats.visibility =  if (binding.textAnswer8Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer9Boats?.setOnClickListener {
            binding.textAnswer9Boats.visibility =  if (binding.textAnswer9Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer10Boats?.setOnClickListener {
            binding.textAnswer10Boats.visibility = if (binding.textAnswer10Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        
        
        with(binding){
            txtViewAnswer11Boats.setOnClickListener {
                textAnswer11Boats.visibility = if (textAnswer11Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer12Boats.setOnClickListener {
                textAnswer12Boats.visibility = if (textAnswer12Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer13Boats.setOnClickListener {
                textAnswer13Boats.visibility = if (textAnswer13Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer14Boats.setOnClickListener {
                textAnswer14Boats.visibility = if (textAnswer14Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer15Boats.setOnClickListener {
                textAnswer15Boats.visibility = if (textAnswer15Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer16Boats.setOnClickListener {
                textAnswer16Boats.visibility = if (textAnswer16Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer17Boats.setOnClickListener {
                textAnswer17Boats.visibility = if (textAnswer17Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer18Boats.setOnClickListener {
                textAnswer18Boats.visibility = if (textAnswer18Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer19Boats.setOnClickListener {
                textAnswer19Boats.visibility = if (textAnswer19Boats.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            radioGroup11Boats.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton43Boats.isChecked
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

            radioGroup12Boats.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton48Boats.isChecked
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
            radioGroup13Boats.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton52Boats.isChecked
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

            radioGroup14Boats.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton54Boats.isChecked
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
            radioGroup15Boats.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton57Boats.isChecked
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
            radioGroup16Boats.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton64Boats.isChecked
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
            radioGroup17Boats.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton65Boats.isChecked
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
            radioGroup18Boats.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton72Boats.isChecked
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
            radioGroup19Boats.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton74Boats.isChecked
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
        

        //RadiopGroups

        binding.radioGroup1Boats?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton3Boats.isChecked

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
        binding.radioGroup2Boats?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton7Boats.isChecked

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
        binding.radioGroup3Boats?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton11Boats.isChecked

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
        binding.radioGroup4Boats?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton14Boats.isChecked

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
        binding.radioGroup5Boats?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton19Boats.isChecked

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
        binding.radioGroup6Boats?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton22Boats.isChecked
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
        binding.radioGroup7Boats?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton28Boats.isChecked
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
        binding.radioGroup8Boats?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton29Boats.isChecked
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
        binding.radioGroup9Boats?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton33Boats.isChecked
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
        binding.radioGroup10Boats?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = binding.radioButton40Boats.isChecked
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