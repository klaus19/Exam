package com.tejas.exam.dominika

import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.ActivityMarathiBinding
import kotlin.properties.Delegates

class Marathi: AppCompatActivity() {

    private lateinit var binding: ActivityMarathiBinding
    var isAllFabsVisible by Delegates.notNull<Boolean>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //added actionbar backpressed icon to go to previous screen
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding = ActivityMarathiBinding.inflate(layoutInflater)
        binding.root?.apply {
            setContentView(this)
        }
        with(binding) {

            txtViewAnswer1Marathi.setOnClickListener {
                textAnswer1Marathi.visibility =
                    if (textAnswer1Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }

            txtViewAnswer2Marathi.setOnClickListener {
                textAnswer2Marathi.visibility =
                    if (textAnswer2Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }

            txtViewAnswer3Marathi.setOnClickListener {
                textAnswer3Marathi.visibility =
                    if (textAnswer3Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }

            txtViewAnswer4Marathi.setOnClickListener {
                textAnswer4Marathi.visibility =
                    if (textAnswer4Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }

            txtViewAnswer5Marathi.setOnClickListener {
                textAnswer5Marathi.visibility =
                    if (textAnswer5Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }

            txtViewAnswer6Marathi.setOnClickListener {
                textAnswer6Marathi.visibility =
                    if (textAnswer6Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }

            txtViewAnswer7Marathi.setOnClickListener {
                textAnswer7Marathi.visibility =
                    if (textAnswer7Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }

            txtViewAnswer8Marathi.setOnClickListener {
                textAnswer8Marathi.visibility =
                    if (textAnswer8Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer9Marathi.setOnClickListener {
                textAnswer9Marathi.visibility =
                    if (textAnswer9Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer10Marathi.setOnClickListener {
                textAnswer10Marathi.visibility =
                    if (textAnswer10Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer11Marathi.setOnClickListener {
                textAnswer11Marathi.visibility =
                    if (textAnswer11Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer12Marathi.setOnClickListener {
                textAnswer12Marathi.visibility =
                    if (textAnswer12Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer13Marathi.setOnClickListener {
                textAnswer13Marathi.visibility =
                    if (textAnswer13Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer14Marathi.setOnClickListener {
                textAnswer14Marathi.visibility =
                    if (textAnswer14Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer15Marathi.setOnClickListener {
                textAnswer15Marathi.visibility =
                    if (textAnswer15Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer16Marathi.setOnClickListener {
                textAnswer16Marathi.visibility =
                    if (textAnswer16Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer17Marathi.setOnClickListener {
                textAnswer17Marathi.visibility =
                    if (textAnswer17Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer18Marathi.setOnClickListener {
                textAnswer18Marathi.visibility =
                    if (textAnswer18Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer19Marathi.setOnClickListener {
                textAnswer19Marathi.visibility =
                    if (textAnswer19Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer20Marathi.setOnClickListener {
                textAnswer20Marathi.visibility =
                    if (textAnswer20Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer21Marathi.setOnClickListener {
                textAnswer21Marathi.visibility =
                    if (textAnswer21Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer22Marathi.setOnClickListener {
                textAnswer22Marathi.visibility =
                    if (textAnswer22Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer23Marathi.setOnClickListener {
                textAnswer23Marathi.visibility =
                    if (textAnswer23Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer24Marathi.setOnClickListener {
                textAnswer24Marathi.visibility =
                    if (textAnswer24Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
            txtViewAnswer25Marathi.setOnClickListener {
                textAnswer25Marathi.visibility =
                    if (textAnswer25Marathi.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }


            //RadioButton

            radioGroup1Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton4Marathi.isChecked
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

            radioGroup2Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton5Marathi.isChecked
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

            radioGroup3Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton9Marathi.isChecked
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

            radioGroup4Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton14Marathi.isChecked
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

            radioGroup5Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton20Marathi.isChecked
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

            radioGroup6Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton24Marathi.isChecked
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

            radioGroup7Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton26Marathi.isChecked
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

            radioGroup8Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton32Marathi.isChecked
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

            radioGroup9Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton36Marathi.isChecked
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

            radioGroup10Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton39Marathi.isChecked
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
            radioGroup11Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton43Marathi.isChecked
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

            radioGroup12Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton45Marathi.isChecked
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
            radioGroup13Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton51Marathi.isChecked
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

            radioGroup14Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton56Marathi.isChecked
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
            radioGroup15Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton58Marathi.isChecked
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
            radioGroup16Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton61Marathi.isChecked
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
            radioGroup17Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton66Marathi.isChecked
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
            radioGroup18Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton72Marathi.isChecked
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
            radioGroup19Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton73Marathi.isChecked
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
            radioGroup20Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton77Marathi.isChecked
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
            radioGroup21Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton81Marathi.isChecked
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
            radioGroup22Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton85Marathi.isChecked
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
            radioGroup23Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton90Marathi.isChecked
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
            radioGroup24Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton95Marathi.isChecked
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
            radioGroup25Marathi.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

                val isChecked = radioButton97Marathi.isChecked
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

        // Now set all the FABs and all the action name
        // texts as GONE
        binding.addTestFab.visibility = View.GONE
        binding.addAlarmFab.visibility = View.GONE
        binding.addCallText.visibility = View.GONE
        binding.addTestActionText.visibility = View.GONE

        // make the boolean variable as false, as all the
        // action name texts and all the sub FABs are invisible
        isAllFabsVisible = false

        binding.addFab.setOnClickListener {

            if (!isAllFabsVisible) {
                if (!isAllFabsVisible) {

                    // when isAllFabsVisible becomes
                    // true make all the action name
                    // texts and FABs VISIBLE.
                    binding.addAlarmFab.show()
                    binding.addTestFab.show()
                    binding.addCallText.visibility = View.VISIBLE
                    binding.addTestActionText.visibility = View.VISIBLE

                    // make the boolean variable true as
                    // we have set the sub FABs
                    // visibility to GONE
                    isAllFabsVisible = true
                } else {

                    // when isAllFabsVisible becomes
                    // true make all the action name
                    // texts and FABs GONE.


                    // when isAllFabsVisible becomes
                    // true make all the action name
                    // texts and FABs GONE.
                    binding.addAlarmFab.hide()
                    binding.addTestFab.hide()
                    binding.addCallText.visibility = View.GONE
                    binding.addTestActionText.visibility = View.GONE

                    // make the boolean variable false
                    // as we have set the sub FABs
                    // visibility to GONE

                    // make the boolean variable false
                    // as we have set the sub FABs
                    // visibility to GONE
                    isAllFabsVisible = false
                }
            }

        }
    }
    // to go back to previous screen
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}