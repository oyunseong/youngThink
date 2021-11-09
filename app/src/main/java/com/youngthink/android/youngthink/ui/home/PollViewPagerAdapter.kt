package com.youngthink.android.youngthink.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.youngthink.android.youngthink.databinding.FragmentVotingOverviewBinding

class PollViewPagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PollCommentFragment()
            1 -> VotingOverViewFragment()
            else-> StatisticsFragment()
        }
    }
}