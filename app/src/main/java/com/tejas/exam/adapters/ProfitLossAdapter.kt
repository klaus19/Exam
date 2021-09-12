package com.tejas.exam.adapters


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tejas.exam.quantitative.fragments.ProfitLossFormulasFragment
import com.tejas.exam.quantitative.fragments.ProfitLossProblemsFragment

class ProfitLossAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0->{
                return ProfitLossProblemsFragment()
            }
            1->{
                return ProfitLossFormulasFragment()
            }
            else ->{
                return ProfitLossProblemsFragment()
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