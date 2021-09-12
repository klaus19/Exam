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
import com.tejas.exam.databinding.CalenderProblemsFragmentBinding


class CalenderProblemsFragment : Fragment() {

    private lateinit var bindingCalendar:CalenderProblemsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.calender_problems_fragment, container, false)

        bindingCalendar=CalenderProblemsFragmentBinding.inflate(inflater, container, false)


        bindingCalendar.txtViewAnswer1Calender?.setOnClickListener {
            bindingCalendar.txtAnswer1Calender.visibility =if( bindingCalendar.txtAnswer1Calender.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingCalendar.txtViewAnswer2Calender?.setOnClickListener {
            bindingCalendar.txtAnswer2Calender.visibility =if( bindingCalendar.txtAnswer2Calender.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindingCalendar.txtViewAnswer3Calender?.setOnClickListener {
            bindingCalendar.txtAnswer3Calender.visibility =if( bindingCalendar.txtAnswer3Calender.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingCalendar.txtViewAnswer4Calender?.setOnClickListener {
            bindingCalendar.txtAnswer4Calender.visibility =if( bindingCalendar.txtAnswer4Calender.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindingCalendar.textViewAnswer5Calender?.setOnClickListener {
            bindingCalendar.txtAnswer5Calender.visibility =if( bindingCalendar.txtAnswer5Calender.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindingCalendar.textViewAnswer6Calender?.setOnClickListener {
            bindingCalendar.txtAnswer6Calender.visibility =if( bindingCalendar.txtAnswer6Calender.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindingCalendar.textViewAnswer7Calender?.setOnClickListener {
            bindingCalendar.txtAnswer7Calender.visibility =if( bindingCalendar.txtAnswer7Calender.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindingCalendar.textViewAnswer8Calender?.setOnClickListener {
            bindingCalendar.txtAnswer8Calender.visibility =if( bindingCalendar.txtAnswer8Calender.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindingCalendar.textViewAnswer9Calender?.setOnClickListener {
            bindingCalendar.txtAnswer9Calender.visibility =if( bindingCalendar.txtAnswer9Calender.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindingCalendar.textViewAnswer10Calender?.setOnClickListener {
            bindingCalendar.txtAnswer10Calender.visibility =if( bindingCalendar.txtAnswer10Calender.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        
        with(bindingCalendar){
            txtViewAnswer11Calender.setOnClickListener {
                textAnswer11Calender.visibility = if (textAnswer11Calender.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer12Calender.setOnClickListener {
                textAnswer12Calender.visibility = if (textAnswer12Calender.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer13Calender.setOnClickListener {
                textAnswer13Calender.visibility = if (textAnswer13Calender.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer14Calender.setOnClickListener {
                textAnswer14Calender.visibility = if (textAnswer14Calender.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer15Calender.setOnClickListener {
                textAnswer15Calender.visibility = if (textAnswer15Calender.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }

            radioGroup11Calender.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton44Calender.isChecked
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

            radioGroup12Calender.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton45Calender.isChecked
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
            radioGroup13Calender.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton52Calender.isChecked
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

            radioGroup14Calender.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton55Calender.isChecked
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
            radioGroup15Calender.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton58Calender.isChecked
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


        bindingCalendar.radioGroup1Calender?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =bindingCalendar.radioButton3Calender.isChecked
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

        bindingCalendar.radioGroup2Calender?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =bindingCalendar.radioButton8Calender.isChecked
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
        bindingCalendar.radioGroup3Calender?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =bindingCalendar.radioButton12Calender.isChecked
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
        bindingCalendar.radioGroup4Calender?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =bindingCalendar.radioButton13Calender.isChecked
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
        bindingCalendar.radioGroup5Calender?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =bindingCalendar.radioButton18Calender.isChecked
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

        bindingCalendar.radioGroup6Calender?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =bindingCalendar.radioButton21Calender.isChecked
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

        bindingCalendar.radioGroup7Calender?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =bindingCalendar.radioButton28Calender.isChecked
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

        bindingCalendar.radioGroup8Calender?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingCalendar.radioButton30Calender.isChecked

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

        bindingCalendar.radioGroup9Calender?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =bindingCalendar.radioButton35Calender.isChecked

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

        bindingCalendar.radioGroup10Calender?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =bindingCalendar.radioButton39Calender.isChecked
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


        return bindingCalendar.root
    }



}