package com.youngthink.android.youngthink

import android.view.LayoutInflater
import android.view.ViewGroup
import com.youngthink.android.youngthink.base.BaseFragment
import com.youngthink.android.youngthink.databinding.FragmentBBinding

class BTapFragment :BaseFragment<FragmentBBinding>(){
    override fun initClickListener() {

    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentBBinding {
        return FragmentBBinding.inflate(inflater,container,false)
    }
}