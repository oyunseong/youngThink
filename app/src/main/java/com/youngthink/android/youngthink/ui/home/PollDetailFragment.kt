package com.youngthink.android.youngthink.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.youngthink.android.youngthink.base.BaseFragment
import com.youngthink.android.youngthink.databinding.FragmentDetailPollBinding

class PollDetailFragment : BaseFragment<FragmentDetailPollBinding>(){
    override fun initClickListener() {
        viewPager2()
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentDetailPollBinding {
        return FragmentDetailPollBinding.inflate(inflater,container,false)
    }

    fun viewPager2(){
        binding.detailPollTablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                // 탭이 선택되었을 때
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // 탭이 선택되지 않은 상태로 변경 되었을 때
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // 이미 선태된 탭이 다시 선택 되었을 때
            }
        })
        binding.detailPollViewpager2.adapter = PollViewPagerAdapter(requireActivity())

        TabLayoutMediator(binding.detailPollTablayout, binding.detailPollViewpager2){tab, position ->
            when(position){
                0 ->tab.text = "댓글"
                1 ->tab.text = "투표 개요"
                2 ->tab.text = "통계 보기"
            }
        }.attach()
    }
}