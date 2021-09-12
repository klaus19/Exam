package com.tejas.exam.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tejas.exam.quantitative.fragments.PartnershipFormulas
import com.tejas.exam.quantitative.fragments.PartnershipProblems

class PartnershipAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0->{
                return PartnershipProblems()
            }
            1->{
                return PartnershipFormulas()
            }
            else ->{
                return PartnershipProblems()
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