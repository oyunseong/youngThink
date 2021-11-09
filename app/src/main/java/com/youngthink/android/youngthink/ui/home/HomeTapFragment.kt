package com.youngthink.android.youngthink.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.youngthink.android.youngthink.R
import com.youngthink.android.youngthink.base.BaseFragment
import com.youngthink.android.youngthink.databinding.FragmentHomeBinding

class HomeTapFragment :BaseFragment<FragmentHomeBinding>(){
    override fun initClickListener() {
        binding.homeText.setOnClickListener {
            view?.findNavController()?.navigate(R.id.PollDetailFragment)
        }
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater,container,false)
    }
}