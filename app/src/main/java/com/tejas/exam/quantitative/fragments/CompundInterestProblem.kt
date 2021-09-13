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

        //Usage of Scope function with()
        with(binding){
            txtViewAnswer13CompoundInterest.setOnClickListener {
                textAnswer13CompoundInterest.visibility = if (textAnswer13CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer14CompoundInterest.setOnClickListener {
                textAnswer14CompoundInterest.visibility = if (textAnswer14CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer15CompoundInterest.setOnClickListener {
                textAnswer15CompoundInterest.visibility = if (textAnswer15CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer16CompoundInterest.setOnClickListener {
                textAnswer16CompoundInterest.visibility = if (textAnswer16CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer17CompoundInterest.setOnClickListener {
                textAnswer17CompoundInterest.visibility = if (textAnswer17CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer18CompoundInterest.setOnClickListener {
                textAnswer18CompoundInterest.visibility = if (textAnswer18CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer19CompoundInterest.setOnClickListener {
                textAnswer19CompoundInterest.visibility = if (textAnswer19CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer20CompoundInterest.setOnClickListener {
                textAnswer20CompoundInterest.visibility = if (textAnswer20CompoundInterest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            
            //Radio on checked Listener 
            radioGroup11CompoundInterest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton41CompoundInterest.isChecked
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

            radioGroup12CompoundInterest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton46CompoundInterest.isChecked
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
            radioGroup13CompoundInterest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton52CompoundInterest.isChecked
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

            radioGroup14CompoundInterest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton55CompoundInterest.isChecked
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
            radioGroup15CompoundInterest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton57CompoundInterest.isChecked
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
            radioGroup16CompoundInterest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton64CompoundInterest.isChecked
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
            radioGroup17CompoundInterest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton68CompoundInterest.isChecked
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
            radioGroup18CompoundInterest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton71CompoundInterest.isChecked
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
            radioGroup19CompoundInterest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton73CompoundInterest.isChecked
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
            radioGroup20CompoundInterest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton78CompoundInterest.isChecked
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