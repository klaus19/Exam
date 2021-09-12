package com.tejas.exam.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tejas.exam.quantitative.fragments.AgesFormulas
import com.tejas.exam.quantitative.fragments.AgesProblems
import com.tejas.exam.quantitative.fragments.AreaFormulas
import com.tejas.exam.quantitative.fragments.AreaProblems

class AreaAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
       return 2
    }

    override fun getItem(position: Int): Fragment {
        when(position) {

            0->{
                return AreaProblems()
            }
            1->{
                return AreaFormulas()
            }
            else->{
                return AreaProblems()
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