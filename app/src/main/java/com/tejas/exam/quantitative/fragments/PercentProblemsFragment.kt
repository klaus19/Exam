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
import com.tejas.exam.databinding.PercentProblemsFragmentBinding


class PercentProblemsFragment : Fragment() {
      private lateinit var bindinpercentproblemsFragment:PercentProblemsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.percent_problems_fragment, container, false)
        bindinpercentproblemsFragment = PercentProblemsFragmentBinding.inflate(inflater, container, false)


        bindinpercentproblemsFragment.txtViewAnswer1Percentage?.setOnClickListener {
            bindinpercentproblemsFragment .txtAnswer1Percentage.visibility =
                if( bindinpercentproblemsFragment.txtAnswer1Percentage.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindinpercentproblemsFragment.txtViewAnswer2Percentage?.setOnClickListener {
            bindinpercentproblemsFragment .txtAnswer2Percentage.visibility =if( bindinpercentproblemsFragment.txtAnswer2Percentage.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindinpercentproblemsFragment.txtViewAnswer3Percentage?.setOnClickListener {
            bindinpercentproblemsFragment .txtAnswer3Percentage.visibility =if( bindinpercentproblemsFragment.txtAnswer3Percentage.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindinpercentproblemsFragment.txtViewAnswer4Percentage?.setOnClickListener {
            bindinpercentproblemsFragment .txtAnswer4Percentage.visibility =if( bindinpercentproblemsFragment.txtAnswer4Percentage.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindinpercentproblemsFragment.textViewAnswer5Percentage?.setOnClickListener {
            bindinpercentproblemsFragment .txtAnswer5Percentage.visibility =if( bindinpercentproblemsFragment.txtAnswer5Percentage.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindinpercentproblemsFragment.textViewAnswer6Percentage?.setOnClickListener {
            bindinpercentproblemsFragment .txtAnswer6Percentage.visibility =if( bindinpercentproblemsFragment.txtAnswer6Percentage.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindinpercentproblemsFragment.textViewAnswer7Percentage?.setOnClickListener {
            bindinpercentproblemsFragment .txtAnswer7Percentage.visibility =if( bindinpercentproblemsFragment.txtAnswer7Percentage.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindinpercentproblemsFragment.textViewAnswer8Percentage?.setOnClickListener {
            bindinpercentproblemsFragment .txtAnswer8Percentage.visibility =if( bindinpercentproblemsFragment.txtAnswer8Percentage.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindinpercentproblemsFragment.textViewAnswer9Percentage?.setOnClickListener {
            bindinpercentproblemsFragment .txtAnswer9Percentage.visibility =if( bindinpercentproblemsFragment.txtAnswer9Percentage.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindinpercentproblemsFragment.textViewAnswer10Percentage?.setOnClickListener {
            bindinpercentproblemsFragment .txtAnswer10Percentage.visibility =if( bindinpercentproblemsFragment.txtAnswer10Percentage.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        with(bindinpercentproblemsFragment){
            txtViewAnswer11Percent.setOnClickListener {
                textAnswer11Percent.visibility = if (textAnswer11Percent.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer12Percent.setOnClickListener {
                textAnswer12Percent.visibility = if (textAnswer12Percent.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer13Percent.setOnClickListener {
                textAnswer13Percent.visibility = if (textAnswer13Percent.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer14Percent.setOnClickListener {
                textAnswer14Percent.visibility = if (textAnswer14Percent.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer15Percent.setOnClickListener {
                textAnswer15Percent.visibility = if (textAnswer15Percent.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }

            radioGroup11Percent.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton41Percent.isChecked
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

            radioGroup12Percent.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton46Percent.isChecked
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
            radioGroup13Percent.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton51Percent.isChecked
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

            radioGroup14Percent.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton53Percent.isChecked
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
            radioGroup15Percent.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton58Percent.isChecked
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

//RadioButtons

        bindinpercentproblemsFragment.radioGroup1Percentage?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindinpercentproblemsFragment.radioButton2Percentage.isChecked
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

        bindinpercentproblemsFragment.radioGroup2Percentage?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindinpercentproblemsFragment.radioButton7Percentage.isChecked
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
        bindinpercentproblemsFragment.radioGroup3Percentage?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindinpercentproblemsFragment.radioButton12Percentage.isChecked

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
        bindinpercentproblemsFragment.radioGroup4Percentage?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindinpercentproblemsFragment.radioButton15Percentage.isChecked
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

        bindinpercentproblemsFragment.radioGroup5Percentage?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindinpercentproblemsFragment.radioButton17Percentage.isChecked
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

        bindinpercentproblemsFragment.radioGroup6Percentage?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindinpercentproblemsFragment.radioButton24Percentage.isChecked
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

        bindinpercentproblemsFragment.radioGroup7Percentage?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindinpercentproblemsFragment.radioButton28Percentage.isChecked
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

        bindinpercentproblemsFragment.radioGroup8Percentage?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindinpercentproblemsFragment.radioButton32Percentage.isChecked
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

        bindinpercentproblemsFragment.radioGroup9Percentage?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindinpercentproblemsFragment.radioButton33Percentage.isChecked
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

        bindinpercentproblemsFragment.radioGroup10Percentage?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindinpercentproblemsFragment.radioButton37Percentage.isChecked
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


        return bindinpercentproblemsFragment.root
    }


    //Snackbar colours code

    fun Snackbar.withColor(@ColorInt colorInt:Int): Snackbar {
        this.view.setBackgroundColor(colorInt)
        return this
    }
}