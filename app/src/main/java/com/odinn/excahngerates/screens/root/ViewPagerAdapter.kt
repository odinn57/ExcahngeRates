package com.odinn.excahngerates.screens.root

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.odinn.excahngerates.screens.favorite.FavoriteFragment
import com.odinn.excahngerates.screens.first.FirstFragment

class ViewPagerAdapter(fragmentActivity:FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FirstFragment()
            else -> FavoriteFragment()
        }
    }
}