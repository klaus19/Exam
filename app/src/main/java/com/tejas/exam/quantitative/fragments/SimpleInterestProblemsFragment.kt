package com.tejas.exam.quantitative.fragments

import android.graphics.Color
import android.graphics.Color.rgb
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.RadioGroup
import android.widget.Toast
import androidx.annotation.ColorInt
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.SimpleinterestProblemsFragmentBinding


class SimpleInterestProblemsFragment : Fragment() {

    private lateinit var bindingSimpleInterestProblemsFragment: SimpleinterestProblemsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.simpleinterest_problems_fragment, container, false)

        bindingSimpleInterestProblemsFragment =
            SimpleinterestProblemsFragmentBinding.inflate(inflater, container, false)


        bindingSimpleInterestProblemsFragment.txtViewAnswer1Interest?.setOnClickListener {
            bindingSimpleInterestProblemsFragment.txtAnswer1Interest.visibility =
                if (bindingSimpleInterestProblemsFragment.txtAnswer1Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingSimpleInterestProblemsFragment.txtViewAnswer2Interest?.setOnClickListener {
            bindingSimpleInterestProblemsFragment.txtAnswer2Interest.visibility =
                if (bindingSimpleInterestProblemsFragment.txtAnswer2Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindingSimpleInterestProblemsFragment.txtViewAnswer3Interest?.setOnClickListener {
            bindingSimpleInterestProblemsFragment.txtAnswer3Interest.visibility =
                if (bindingSimpleInterestProblemsFragment.txtAnswer3Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        bindingSimpleInterestProblemsFragment.txtViewAnswer4Interest?.setOnClickListener {
            bindingSimpleInterestProblemsFragment.txtAnswer4Interest.visibility =
                if (bindingSimpleInterestProblemsFragment.txtAnswer4Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindingSimpleInterestProblemsFragment.textViewAnswer5Interest?.setOnClickListener {
            bindingSimpleInterestProblemsFragment.txtAnswer5Interest.visibility =
                if (bindingSimpleInterestProblemsFragment.txtAnswer5Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindingSimpleInterestProblemsFragment.textViewAnswer6Interest?.setOnClickListener {
            bindingSimpleInterestProblemsFragment.txtAnswer6Interest.visibility =
                if (bindingSimpleInterestProblemsFragment.txtAnswer6Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindingSimpleInterestProblemsFragment.textViewAnswer7Interest?.setOnClickListener {
            bindingSimpleInterestProblemsFragment.txtAnswer7Interest.visibility =
                if (bindingSimpleInterestProblemsFragment.txtAnswer7Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindingSimpleInterestProblemsFragment.textViewAnswer8Interest?.setOnClickListener {
            bindingSimpleInterestProblemsFragment.txtAnswer8Interest.visibility =
                if (bindingSimpleInterestProblemsFragment.txtAnswer8Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindingSimpleInterestProblemsFragment.textViewAnswer9Interest?.setOnClickListener {
            bindingSimpleInterestProblemsFragment.txtAnswer9Interest.visibility =
                if (bindingSimpleInterestProblemsFragment.txtAnswer9Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        bindingSimpleInterestProblemsFragment.textViewAnswer10Interest?.setOnClickListener {
            bindingSimpleInterestProblemsFragment.txtAnswer10Interest.visibility =
                if (bindingSimpleInterestProblemsFragment.txtAnswer10Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        
        with(bindingSimpleInterestProblemsFragment){
            txtViewAnswer11Interest.setOnClickListener {
                textAnswer11Interest.visibility = if (textAnswer11Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer12Interest.setOnClickListener {
                textAnswer12Interest.visibility = if (textAnswer12Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer13Interest.setOnClickListener {
                textAnswer13Interest.visibility = if (textAnswer13Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer14Interest.setOnClickListener {
                textAnswer14Interest.visibility = if (textAnswer14Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer15Interest.setOnClickListener {
                textAnswer15Interest.visibility = if (textAnswer15Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer16Interest.setOnClickListener {
                textAnswer16Interest.visibility = if (textAnswer16Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer17Interest.setOnClickListener {
                textAnswer17Interest.visibility = if (textAnswer17Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer18Interest.setOnClickListener {
                textAnswer18Interest.visibility = if (textAnswer18Interest.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }


            radioGroup11Interest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton43Interest.isChecked
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

            radioGroup12Interest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton47Interest.isChecked
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
            radioGroup13Interest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton52Interest.isChecked
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

            radioGroup14Interest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton53Interest.isChecked
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
            radioGroup15Interest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton60Interest.isChecked
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
            radioGroup16Interest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton64Interest.isChecked
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
            radioGroup17Interest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton67Interest.isChecked
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
            radioGroup18Interest.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

                val isChecked = radioButton72Interest.isChecked
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

//Radio Groups

        bindingSimpleInterestProblemsFragment.radioGroup1Interest?.setOnCheckedChangeListener { group, checkedId_ ->

            val isChecked = bindingSimpleInterestProblemsFragment.radioButton3Interest.isChecked


            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(rgb(0, 128, 0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(rgb(255, 0, 0)).show()
            }

        }
        bindingSimpleInterestProblemsFragment.radioGroup2Interest?.setOnCheckedChangeListener { group, checkedId_ ->

            val isChecked = bindingSimpleInterestProblemsFragment.radioButton5Interest.isChecked


            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(rgb(0, 128, 0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(rgb(255, 0, 0)).show()
            }

        }
        bindingSimpleInterestProblemsFragment.radioGroup3Interest?.setOnCheckedChangeListener { group, checkedId_ ->

            val isChecked = bindingSimpleInterestProblemsFragment.radioButton12Interest.isChecked


            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(rgb(0, 128, 0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(rgb(255, 0, 0)).show()
            }

        }
        bindingSimpleInterestProblemsFragment.radioGroup4Interest?.setOnCheckedChangeListener { group, checkedId_ ->

            val isChecked = bindingSimpleInterestProblemsFragment.radioButton14Interest.isChecked


            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(rgb(0, 128, 0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(rgb(255, 0, 0)).show()
            }
        }
        bindingSimpleInterestProblemsFragment.radioGroup5Interest?.setOnCheckedChangeListener { group, checkedId_ ->

            val isChecked = bindingSimpleInterestProblemsFragment.radioButton18Interest.isChecked

            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(rgb(0, 128, 0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(rgb(255, 0, 0)).show()
            }

        }
        bindingSimpleInterestProblemsFragment.radioGroup6Interest?.setOnCheckedChangeListener { group, checkedId_ ->

            val isChecked = bindingSimpleInterestProblemsFragment.radioButton24Interest.isChecked


            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(rgb(0, 128, 0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(rgb(255, 0, 0)).show()
            }

        }
        bindingSimpleInterestProblemsFragment.radioGroup7Interest?.setOnCheckedChangeListener { group, checkedId_ ->

            val isChecked = bindingSimpleInterestProblemsFragment.radioButton26Interest.isChecked


            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(rgb(0, 128, 0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(rgb(255, 0, 0)).show()
            }

        }
        bindingSimpleInterestProblemsFragment.radioGroup8Interest?.setOnCheckedChangeListener { group, checkedId_ ->

            val isChecked = bindingSimpleInterestProblemsFragment.radioButton32Interest.isChecked

            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(rgb(0, 128, 0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(rgb(255, 0, 0)).show()
            }
        }
        bindingSimpleInterestProblemsFragment.radioGroup9Interest?.setOnCheckedChangeListener { group, checkedId_ ->

            val isChecked = bindingSimpleInterestProblemsFragment.radioButton35Interest.isChecked


            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(rgb(0, 128, 0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(rgb(255, 0, 0)).show()
            }

        }
        bindingSimpleInterestProblemsFragment.radioGroup10Interest?.setOnCheckedChangeListener { group, checkedId_ ->

            val isChecked =
                bindingSimpleInterestProblemsFragment.radioButton39Interest.isChecked

            if (isChecked) {
                Snackbar.make(requireView(), "Correct", Snackbar.LENGTH_LONG)
                    .withColor(rgb(0, 128, 0)).show()
            } else {
                Snackbar.make(requireView(), "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(rgb(255, 0, 0)).show()
            }

        }



        return bindingSimpleInterestProblemsFragment.root

    }

    //Snackbar colours code

    fun Snackbar.withColor(@ColorInt colorInt:Int): Snackbar {
        this.view.setBackgroundColor(colorInt)
        return this
    }

}