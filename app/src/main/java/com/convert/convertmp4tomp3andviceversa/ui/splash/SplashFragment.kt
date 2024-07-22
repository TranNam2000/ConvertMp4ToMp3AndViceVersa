package com.convert.convertmp4tomp3andviceversa.ui.splash

import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.convert.convertmp4tomp3andviceversa.base.BaseFragmentWithBinding
import com.convert.convertmp4tomp3andviceversa.databinding.FragmentSplashBinding
import com.convert.convertmp4tomp3andviceversa.ui.home.HomeFragment

class SplashFragment : BaseFragmentWithBinding<FragmentSplashBinding>() {

    companion object {
        fun newInstance() = SplashFragment()
    }

    private val viewModel: SplashViewModel by viewModels()


    override fun getViewBinding(inflater: LayoutInflater): FragmentSplashBinding {
        return FragmentSplashBinding.inflate(inflater)
    }


    override fun init() {

        Handler(Looper.getMainLooper()).postDelayed({
            openFragment(HomeFragment::class.java)
        }, 200)
    }

    override fun initData() {

    }

    override fun initAction() {

    }
}