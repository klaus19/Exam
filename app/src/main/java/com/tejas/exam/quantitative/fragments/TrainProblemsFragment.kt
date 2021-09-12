package com.tejas.exam.quantitative.fragments

import android.graphics.Color
import android.graphics.Color.*
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.annotation.ColorInt
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.TrainProblemsFragmentBinding



class TrainProblemsFragment : Fragment() {

    private lateinit var bindingTrainFragment:TrainProblemsFragmentBinding




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.train_problems_fragment, container, false)
        bindingTrainFragment = TrainProblemsFragmentBinding.inflate(inflater, container, false)




        bindingTrainFragment.textViewAnswer1Trains?.setOnClickListener {
          bindingTrainFragment.textAnswer1Trains.visibility = if(bindingTrainFragment.textAnswer1Trains.visibility == View.INVISIBLE)
              View.VISIBLE else View.INVISIBLE
        }

        bindingTrainFragment.textViewAnswer2Trains?.setOnClickListener {
            bindingTrainFragment.textAnswer2Trains.visibility = if(bindingTrainFragment.textAnswer2Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingTrainFragment.textViewAnswer3Trains?.setOnClickListener {
            bindingTrainFragment.textAnswer3Trains.visibility = if(bindingTrainFragment.textAnswer3Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingTrainFragment.textViewAnswer4Trains?.setOnClickListener {
            bindingTrainFragment.textAnswer4Trains.visibility = if(bindingTrainFragment.textAnswer4Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingTrainFragment.textViewAnswer5Trains?.setOnClickListener {
            bindingTrainFragment.textAnswer5Trains.visibility = if(bindingTrainFragment.textAnswer5Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingTrainFragment.textViewAnswer6Trains?.setOnClickListener {
            bindingTrainFragment.textAnswer6Trains.visibility = if(bindingTrainFragment.textAnswer6Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingTrainFragment.textViewAnswer7Trains?.setOnClickListener {
            bindingTrainFragment.textAnswer7Trains.visibility = if(bindingTrainFragment.textAnswer7Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingTrainFragment.textViewAnswer8Trains?.setOnClickListener {
            bindingTrainFragment.textAnswer8Trains.visibility = if(bindingTrainFragment.textAnswer8Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingTrainFragment.textViewAnswer9Trains?.setOnClickListener {
            bindingTrainFragment.textAnswer9Trains.visibility = if(bindingTrainFragment.textAnswer10Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingTrainFragment.textViewAnswer10Trains?.setOnClickListener {
            bindingTrainFragment.textAnswer10Trains.visibility = if(bindingTrainFragment.textAnswer10Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindingTrainFragment.txtViewAnswer11Trains.setOnClickListener {
            bindingTrainFragment.textAnswer11Trains.visibility = if (bindingTrainFragment.textAnswer11Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

            with(bindingTrainFragment){

            txtViewAnswer12Trains.setOnClickListener {
                textAnswer12Trains.visibility = if (textAnswer12Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer13Trains.setOnClickListener {
                textAnswer13Trains.visibility = if (textAnswer13Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer14Trains.setOnClickListener {
                textAnswer14Trains.visibility = if (textAnswer14Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer15Trains.setOnClickListener {
                textAnswer15Trains.visibility = if (textAnswer15Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer16Trains.setOnClickListener {
                textAnswer16Trains.visibility = if (textAnswer16Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer17Trains.setOnClickListener {
                textAnswer17Trains.visibility = if (textAnswer17Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer18Trains.setOnClickListener {
                textAnswer18Trains.visibility = if (textAnswer18Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer19Trains.setOnClickListener {
                textAnswer19Trains.visibility = if (textAnswer19Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer20Trains.setOnClickListener {
                textAnswer20Trains.visibility = if (textAnswer20Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer21Trains.setOnClickListener {
                textAnswer21Trains.visibility = if (textAnswer21Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer22Trains.setOnClickListener {
                textAnswer22Trains.visibility = if (textAnswer22Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer23Trains.setOnClickListener {
                textAnswer23Trains.visibility = if (textAnswer23Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer24Trains.setOnClickListener {
                textAnswer24Trains.visibility = if (textAnswer24Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer25Trains.setOnClickListener {
                textAnswer25Trains.visibility = if (textAnswer25Trains.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }


                //RadioGroup.OnCheckedChangeListener{ group, checkedId ->}

                radioGroup11Trains.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                    val isChecked = radioButton42Trains.isChecked
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

                radioGroup12Trains.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                    val isChecked = radioButton46Trains.isChecked
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
                radioGroup13Trains.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                    val isChecked = radioButton51Trains.isChecked
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

                radioGroup14Trains.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                    val isChecked = radioButton54Trains.isChecked
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
                radioGroup15Trains.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                    val isChecked = radioButton60Trains.isChecked
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
                radioGroup16Trains.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                    val isChecked = radioButton62Trains.isChecked
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
                radioGroup17Trains.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                    val isChecked = radioButton68Trains.isChecked
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
                radioGroup18Trains.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                    val isChecked = radioButton70Trains.isChecked
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
                radioGroup19Trains.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                    val isChecked = radioButton76Trains.isChecked
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
                radioGroup20Trains.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                    val isChecked = radioButton77Trains.isChecked
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
                radioGroup21Trains.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                    val isChecked = radioButton84Trains.isChecked
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
                radioGroup22Trains.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                    val isChecked = radioButton88Trains.isChecked
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
                radioGroup23Trains.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                    val isChecked = radioButton91Trains.isChecked
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
                radioGroup24Trains.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                    val isChecked = radioButton94Trains.isChecked
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
                radioGroup25Trains.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                    val isChecked = radioButton98Trains.isChecked
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


//RadioGroup

       bindingTrainFragment.radioGroup1Trains?.setOnCheckedChangeListener(
           RadioGroup.OnCheckedChangeListener { group, checkedId ->

               val isChecked = bindingTrainFragment.radioButton4.isChecked

               if (isChecked) {
                   Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                       .withColor(rgb(0,128,0))
                       .show()

               } else {
                   Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)
                       .withColor(rgb(255,0,0))
                       .show()
               }
           },
       )
        bindingTrainFragment.radioGroup2Trains?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingTrainFragment.radioButton6.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(rgb(0,128,0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(rgb(255,0,0)).show()
            }
        },)
        bindingTrainFragment.radioGroup3Trains?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingTrainFragment.radioButton11.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(rgb(0,128,0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(rgb(255,0,0)).show()
            }
        },)
        bindingTrainFragment.radioGroup4Trains?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingTrainFragment.radioButton14.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(rgb(0,128,0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(rgb(255,0,0)).show()
            }
        },)
        bindingTrainFragment.radioGroup5Trains?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingTrainFragment.radioButton18.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(rgb(0,128,0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(rgb(255,0,0)).show()
            }
        },)
        bindingTrainFragment. radioGroup6Trains?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingTrainFragment.radioButton21.isChecked

            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(rgb(0,128,0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(rgb(255,0,0)).show()
            }
        },)
        bindingTrainFragment. radioGroup7Trains?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingTrainFragment.radioButton25.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(rgb(0,128,0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(rgb(255,0,0)).show()
            }
        },)
        bindingTrainFragment.radioGroup8Trains?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingTrainFragment.radioButton31.isChecked

            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(rgb(0,128,0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(rgb(255,0,0)).show()
            }
        },)
        bindingTrainFragment.radioGroup9Trains?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingTrainFragment.radioButton35.isChecked

            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(rgb(0,128,0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(rgb(255,0,0)).show()
            }
        },)
        bindingTrainFragment.radioGroup10Trains?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingTrainFragment.radioButton38.isChecked
            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG).withColor(rgb(0,128,0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG).withColor(rgb(255,0,0)).show()
            }
        },)
       return bindingTrainFragment.root

    }





}


