package com.tejas.exam.technical

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.tejas.exam.adapters.Tik.Companion.withColor
import com.tejas.exam.databinding.ActivityEngineeringMathematicsBinding


class EngineeringMathematics:AppCompatActivity() {
    private lateinit var binding:ActivityEngineeringMathematicsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEngineeringMathematicsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.txtViewAnswer1EngineeringMathematics?.setOnClickListener {
            binding.textAnswer1EngineeringMathematics.visibility = if (   binding.textAnswer1EngineeringMathematics.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }
        binding.txtViewAnswer2EngineeringMathematics?.setOnClickListener {
            binding.textAnswer2EngineeringMathematics.visibility = if (   binding.textAnswer2EngineeringMathematics.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
        }

        binding.radioGroup1EngineeringMathematics?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =    binding.radioButton1EngineeringMathematics.isChecked

            if (isChecked) {
                Snackbar.make(binding.root, "Correct", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(0, 128, 0))
                    .show()

            } else {
                Snackbar.make(binding.root, "InCorrect", Snackbar.LENGTH_LONG)
                    .withColor(Color.rgb(255, 0, 0))
                    .show()
            }
        })

        binding.radioGroup2EngineeringMathematics?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->

            val isChecked =    binding.radioButton8EngineeringMathematics.isChecked

            if (isChecked) {
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