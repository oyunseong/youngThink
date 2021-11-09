package com.youngthink.android.youngthink.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.youngthink.android.youngthink.base.BaseFragment
import com.youngthink.android.youngthink.databinding.FragmentVotingOverviewBinding

class VotingOverViewFragment : BaseFragment<FragmentVotingOverviewBinding>() {
    override fun initClickListener() {

    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentVotingOverviewBinding {
        return FragmentVotingOverviewBinding.inflate(inflater,container,false)
    }
}