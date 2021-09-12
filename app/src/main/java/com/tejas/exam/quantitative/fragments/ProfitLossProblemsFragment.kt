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
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.ProfitlossProblemsBinding
import com.tejas.exam.databinding.ProfitlossProblemsFragmentBinding


class ProfitLossProblemsFragment : Fragment() {

   private lateinit var bindingprofitlossFragment: ProfitlossProblemsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       //  return inflater.inflate(R.layout.profitloss_problems_fragment, container, false)

        bindingprofitlossFragment = ProfitlossProblemsFragmentBinding.inflate(inflater, container, false)


        bindingprofitlossFragment.txtViewAnswer1Profit?.setOnClickListener {
            bindingprofitlossFragment.txtAnswer1Profit.visibility = if(bindingprofitlossFragment.txtAnswer1Profit.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE

        }



        bindingprofitlossFragment.txtViewAnswer2Profit?.setOnClickListener {
            bindingprofitlossFragment.txtAnswer2Profit.visibility = if(bindingprofitlossFragment.txtAnswer2Profit.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }



        bindingprofitlossFragment.txtViewAnswer3Profit.setOnClickListener {
            bindingprofitlossFragment.txtAnswer3Profit.visibility = if(bindingprofitlossFragment.txtAnswer3Profit.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }



        bindingprofitlossFragment.txtViewAnswer4Profit?.setOnClickListener {
            bindingprofitlossFragment.txtAnswer4Profit.visibility = if(bindingprofitlossFragment.txtAnswer4Profit.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingprofitlossFragment.tejasPratik?.setOnClickListener {
            bindingprofitlossFragment.txtAnswer5Profit.visibility = if(bindingprofitlossFragment.txtAnswer5Profit.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingprofitlossFragment.textViewAnswer6Profit?.setOnClickListener {
            bindingprofitlossFragment.txtAnswer6Profit.visibility = if(bindingprofitlossFragment.txtAnswer6Profit.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }


        bindingprofitlossFragment.textViewAnswer7Profit?.setOnClickListener {
            bindingprofitlossFragment.txtAnswer7Profit.visibility = if(bindingprofitlossFragment.txtAnswer7Profit.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingprofitlossFragment.textViewAnswer8Profit?.setOnClickListener {
            bindingprofitlossFragment.txtAnswer8Profit.visibility = if(bindingprofitlossFragment.txtAnswer8Profit.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingprofitlossFragment.textViewAnswer9Profit?.setOnClickListener {
            bindingprofitlossFragment.txtAnswer9Profit.visibility = if(bindingprofitlossFragment.txtAnswer9Profit.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingprofitlossFragment.textViewAnswer10Profit?.setOnClickListener {
            bindingprofitlossFragment.txtAnswer10Profit.visibility = if(bindingprofitlossFragment.txtAnswer10Profit.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        
        with(bindingprofitlossFragment){
            txtViewAnswer11Profit.setOnClickListener {
                textAnswer11Profit.visibility = if (textAnswer11Profit.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer12Profit.setOnClickListener {
                textAnswer12Profit.visibility = if (textAnswer12Profit.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer13Profit.setOnClickListener {
                textAnswer13Profit.visibility = if (textAnswer13Profit.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer14Profit.setOnClickListener {
                textAnswer14Profit.visibility = if (textAnswer14Profit.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer15Profit.setOnClickListener {
                textAnswer15Profit.visibility = if (textAnswer15Profit.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }

            radioGroup11Profit.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton43Profit.isChecked
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

            radioGroup12Profit.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton45Profit.isChecked
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
            radioGroup13Profit.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton51Profit.isChecked
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

            radioGroup14Profit.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton56Profit.isChecked
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
            radioGroup15Profit.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton58Profit.isChecked
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


//RadioGroups

        bindingprofitlossFragment.radioGroup1Profit?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  bindingprofitlossFragment.radioButton2Profit.isChecked

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
        bindingprofitlossFragment.radioGroup2Profit?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  bindingprofitlossFragment.radioButton6Profit.isChecked
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
        bindingprofitlossFragment.radioGroup3Profit?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  bindingprofitlossFragment.radioButton12Profit.isChecked
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
        bindingprofitlossFragment.radioGroup4Profit?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  bindingprofitlossFragment.radioButton13Profit.isChecked
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
        bindingprofitlossFragment.radioGroup5Profit?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  bindingprofitlossFragment.radioButton20Profit.isChecked
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
        bindingprofitlossFragment.radioGroup6Profit?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  bindingprofitlossFragment.radioButton95Profit.isChecked
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
        bindingprofitlossFragment.radioGroup7Profit?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  bindingprofitlossFragment.radioButton97Profit.isChecked
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
        bindingprofitlossFragment.radioGroup8Profit?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  bindingprofitlossFragment.radioButton444Profit.isChecked
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
        bindingprofitlossFragment.radioGroup9Profit?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  bindingprofitlossFragment.radioButton336Profit.isChecked
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
        bindingprofitlossFragment.radioGroup10Profit?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =  bindingprofitlossFragment.radioButton289Profit.isChecked

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



        return bindingprofitlossFragment.root
    }

//Snackbar colours code

    fun Snackbar.withColor(@ColorInt colorInt:Int):Snackbar {
        this.view.setBackgroundColor(colorInt)
        return this
    }

}