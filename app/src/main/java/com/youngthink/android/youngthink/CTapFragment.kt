package com.youngthink.android.youngthink

import android.view.LayoutInflater
import android.view.ViewGroup
import com.youngthink.android.youngthink.base.BaseFragment
import com.youngthink.android.youngthink.databinding.FragmentCBinding

class CTapFragment :BaseFragment<FragmentCBinding>(){
    override fun initClickListener() {

    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentCBinding {
        return FragmentCBinding.inflate(inflater,container,false)
    }
}