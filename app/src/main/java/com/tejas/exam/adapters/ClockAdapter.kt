package com.tejas.exam.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tejas.exam.quantitative.fragments.AgesFormulas
import com.tejas.exam.quantitative.fragments.AgesProblems
import com.tejas.exam.quantitative.fragments.ClockFormulas
import com.tejas.exam.quantitative.fragments.ClockProblems

class ClockAdapter(fm: FragmentManager): FragmentPagerAdapter(fm)  {


    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        when(position) {

            0->{
                return ClockProblems()
            }
            1->{
                return ClockFormulas()
            }
            else->{
                return ClockProblems()
            }

        }
    }

    override fun getPageTitle(position: Int): CharSequence? {

        when(position) {
            0->{
                return "Problems"
            }
            1->{
                return "Formulas"
            }
        }


        return super.getPageTitle(position)
    }
}