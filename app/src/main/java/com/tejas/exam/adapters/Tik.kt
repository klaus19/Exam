package com.tejas.exam.adapters

import androidx.annotation.ColorInt
import com.google.android.material.snackbar.Snackbar

 class Tik {

    //Snackbar colours code

     companion object{
         fun Snackbar.withColor(@ColorInt colorInt:Int): Snackbar {
             this.view.setBackgroundColor(colorInt)
             return this
         }

     }


}