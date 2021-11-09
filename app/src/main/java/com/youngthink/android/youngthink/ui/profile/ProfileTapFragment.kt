package com.youngthink.android.youngthink.ui.profile

import android.view.LayoutInflater
import android.view.ViewGroup
import com.youngthink.android.youngthink.base.BaseFragment
import com.youngthink.android.youngthink.databinding.FragmentProfileBinding

class ProfileTapFragment : BaseFragment<FragmentProfileBinding>() {
    override fun initClickListener() {

    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(inflater, container, false)
    }



}
