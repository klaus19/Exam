package com.tejas.exam.reasoning

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.R
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.ActivityCauseEffectBinding

class CauseEffect:AppCompatActivity() {

    private lateinit var binding:ActivityCauseEffectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCauseEffectBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.txtViewAnswer1CauseEffect?.setOnClickListener {
            binding.textAnswer1CauseEffect.visibility = if (binding.textAnswer1CauseEffect.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer2CauseEffect?.setOnClickListener {
            binding.textAnswer2CauseEffect.visibility = if (binding.textAnswer2CauseEffect.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer3CauseEffect?.setOnClickListener {
            binding.textAnswer3CauseEffect.visibility = if (binding.textAnswer3CauseEffect.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer4CauseEffect?.setOnClickListener {
            binding.textAnswer4CauseEffect.visibility = if (binding.textAnswer4CauseEffect.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer5CauseEffect?.setOnClickListener {
            binding.textAnswer5CauseEffect.visibility = if (binding.textAnswer5CauseEffect.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer6CauseEffect?.setOnClickListener {
            binding.textAnswer6CauseEffect.visibility = if (binding.textAnswer6CauseEffect.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer7CauseEffect?.setOnClickListener {
            binding.textAnswer7CauseEffect.visibility = if (binding.textAnswer7CauseEffect.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer8CauseEffect?.setOnClickListener {
            binding.textAnswer8CauseEffect.visibility = if (binding.textAnswer8CauseEffect.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer9CauseEffect?.setOnClickListener {
            binding.textAnswer9CauseEffect.visibility = if (binding.textAnswer9CauseEffect.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer10CauseEffect?.setOnClickListener {
            binding.textAnswer10CauseEffect.visibility = if (binding.textAnswer10CauseEffect.visibility == View.INVISIBLE)
                View.VISIBLE else View.INVISIBLE
        }

//RadioButton 
        binding.radioGroup1CauseEffect.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton4CauseEffect) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        binding.radioGroup2CauseEffect.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton6CauseEffect) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup3CauseEffect.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton10CauseEffect) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup4CauseEffect.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton16CauseEffect) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup5CauseEffect.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton19CauseEffect) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup6CauseEffect.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton21CauseEffect) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup7CauseEffect.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton28CauseEffect) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup8CauseEffect.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton30CauseEffect) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup9CauseEffect.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton34CauseEffect) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
        binding.radioGroup10CauseEffect.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            if (checkedId== R.id.radioButton37CauseEffect) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })
    }
}