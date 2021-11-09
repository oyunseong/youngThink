package com.youngthink.android.youngthink.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.youngthink.android.youngthink.base.BaseFragment
import com.youngthink.android.youngthink.databinding.FragmentStatisticsBinding

class StatisticsFragment : BaseFragment<FragmentStatisticsBinding>() {
    override fun initClickListener() {

    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentStatisticsBinding {
        return FragmentStatisticsBinding.inflate(inflater,container,false)
    }
}