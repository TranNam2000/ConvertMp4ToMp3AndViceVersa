package com.convert.convertmp4tomp3andviceversa.home

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.convert.convertmp4tomp3andviceversa.R
import com.convert.convertmp4tomp3andviceversa.base.BaseFragmentWithBinding
import com.convert.convertmp4tomp3andviceversa.databinding.FragmentHomeBinding

class HomeFragment : BaseFragmentWithBinding<FragmentHomeBinding>() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private val viewModel: HomeViewModel by viewModels()


    override fun getViewBinding(inflater: LayoutInflater): FragmentHomeBinding {
return  FragmentHomeBinding.inflate(inflater)
    }

    override fun init() {
    }

    override fun initData() {
    }

    override fun initAction() {

    }
}