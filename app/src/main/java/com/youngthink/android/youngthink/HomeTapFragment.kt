package com.youngthink.android.youngthink

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.youngthink.android.youngthink.base.BaseFragment
import com.youngthink.android.youngthink.databinding.FragmentHomeBinding

class HomeTapFragment :BaseFragment<FragmentHomeBinding>(){
    override fun initClickListener() {
//        navController = Navigation.findNavController(view?.rootView!!)
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater,container,false)
    }
}