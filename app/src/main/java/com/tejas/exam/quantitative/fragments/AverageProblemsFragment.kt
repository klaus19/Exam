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
import com.tejas.exam.adapters.Tik
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.AverageProblemsFragmentBinding


class AverageProblemsFragment : Fragment() {

    private lateinit var bindingAverage:AverageProblemsFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.average_problems_fragment, container, false)

        bindingAverage = AverageProblemsFragmentBinding.inflate(inflater, container, false)



        bindingAverage.txtViewAnswer1Average?.setOnClickListener {
            bindingAverage.txtAnswer1Average.visibility =if( bindingAverage.txtAnswer1Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingAverage.txtViewAnswer2Average?.setOnClickListener {
            bindingAverage.txtAnswer2Average.visibility =if( bindingAverage.txtAnswer2Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingAverage.txtViewAnswer3Average?.setOnClickListener {
            bindingAverage.txtAnswer3Average.visibility =if( bindingAverage.txtAnswer3Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingAverage.txtViewAnswer4Average?.setOnClickListener {
            bindingAverage.txtAnswer4Average.visibility =if( bindingAverage.txtAnswer4Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingAverage.textViewAnswer5Average?.setOnClickListener {
            bindingAverage.txtAnswer5Average.visibility =if( bindingAverage.txtAnswer5Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingAverage.textViewAnswer6Average?.setOnClickListener {
            bindingAverage.txtAnswer6Average.visibility =if( bindingAverage.txtAnswer6Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingAverage.textViewAnswer7Average?.setOnClickListener {
            bindingAverage.txtAnswer7Average.visibility =if( bindingAverage.txtAnswer7Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingAverage.textViewAnswer8Average?.setOnClickListener {
            bindingAverage.txtAnswer8Average.visibility =if( bindingAverage.txtAnswer8Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingAverage.textViewAnswer9Average?.setOnClickListener {
            bindingAverage.txtAnswer9Average.visibility =if( bindingAverage.txtAnswer9Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingAverage.textViewAnswer10Average?.setOnClickListener {
            bindingAverage.txtAnswer10Average.visibility =if( bindingAverage.txtAnswer10Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        
        with(bindingAverage){

            txtViewAnswer11Average.setOnClickListener {
                textAnswer11Average.visibility = if (textAnswer11Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer12Average.setOnClickListener {
                textAnswer12Average.visibility = if (textAnswer12Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer13Average.setOnClickListener {
                textAnswer13Average.visibility = if (textAnswer13Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer14Average.setOnClickListener {
                textAnswer14Average.visibility = if (textAnswer14Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer15Average.setOnClickListener {
                textAnswer15Average.visibility = if (textAnswer15Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer16Average.setOnClickListener {
                textAnswer16Average.visibility = if (textAnswer16Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer17Average.setOnClickListener {
                textAnswer17Average.visibility = if (textAnswer17Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer18Average.setOnClickListener {
                textAnswer18Average.visibility = if (textAnswer18Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer19Average.setOnClickListener {
                textAnswer19Average.visibility = if (textAnswer19Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer20Average.setOnClickListener {
                textAnswer20Average.visibility = if (textAnswer20Average.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }


            radioGroup11Average.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton44Average.isChecked
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

            radioGroup12Average.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton46Average.isChecked
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
            radioGroup13Average.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton52Average.isChecked
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

            radioGroup14Average.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton53Average.isChecked
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
            radioGroup15Average.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton59Average.isChecked
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
            radioGroup16Average.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton64Average.isChecked
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
            radioGroup17Average.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton67Average.isChecked
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
            radioGroup18Average.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton72Average.isChecked
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
            radioGroup19Average.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton74Average.isChecked
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
            radioGroup20Average.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton79Average.isChecked
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

        bindingAverage.radioGroup1Average?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingAverage.radioButton1Average.isChecked
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
        bindingAverage.radioGroup2Average?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingAverage.radioButton5Average.isChecked
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

        bindingAverage.radioGroup3Average?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingAverage.radioButton12Average.isChecked
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
        bindingAverage.radioGroup4Average?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingAverage.radioButton15Average.isChecked

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
        bindingAverage.radioGroup5Average?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingAverage.radioButton18Average.isChecked

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
        bindingAverage.radioGroup6Average?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingAverage.radioButton22Average.isChecked

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

        bindingAverage.radioGroup7Average?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingAverage.radioButton25Average.isChecked

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

        bindingAverage.radioGroup8Average?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingAverage.radioButton32Average.isChecked

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

        bindingAverage. radioGroup9Average?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingAverage.radioButton35Average.isChecked

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

        bindingAverage.radioGroup10Average?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked = bindingAverage.radioButton38Average.isChecked

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


        return bindingAverage.root
    }

    //Snackbar colours code

 //   fun Snackbar.withColor(@ColorInt colorInt:Int): Snackbar {
   //     this.view.setBackgroundColor(colorInt)
     //   return this
   // }


}