package com.youngthink.android.youngthink.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.youngthink.android.youngthink.base.BaseFragment
import com.youngthink.android.youngthink.databinding.FragmentPollCommentBinding

class PollCommentFragment :BaseFragment<FragmentPollCommentBinding>(){
    override fun initClickListener() {

    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentPollCommentBinding {
        return FragmentPollCommentBinding.inflate(inflater,container,false)
    }

}