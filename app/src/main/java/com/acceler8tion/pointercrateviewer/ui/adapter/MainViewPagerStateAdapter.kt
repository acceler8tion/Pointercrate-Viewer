package com.acceler8tion.pointercrateviewer.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainViewPagerStateAdapter(fragment: FragmentManager, lifecycle: Lifecycle):
        FragmentStateAdapter(fragment, lifecycle) {

    override fun getItemCount(): Int {
        return 5 //6?
    }

    override fun createFragment(position: Int): Fragment {
        TODO("Not yet implemented")
    }

}