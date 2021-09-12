package com.tejas.exam.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tejas.exam.quantitative.fragments.SimplificationFormula
import com.tejas.exam.quantitative.fragments.SimplificationProblem


class SimplificationAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0->{
                SimplificationProblem()
            }
            1->{
                SimplificationFormula()
            }
            else ->{
                SimplificationProblem()
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