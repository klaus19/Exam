package com.tejas.exam.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tejas.exam.quantitative.SimpleInterestProblems
import com.tejas.exam.quantitative.fragments.SimpleInterestFormulasFragment
import com.tejas.exam.quantitative.fragments.SimpleInterestProblemsFragment

class SimpleInterestAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0->{
                return SimpleInterestProblemsFragment()
            }
            1->{
                return SimpleInterestFormulasFragment()
            } else ->{
                return SimpleInterestProblemsFragment()
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