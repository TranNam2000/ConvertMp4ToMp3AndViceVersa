package com.convert.convertmp4tomp3andviceversa.ui

import android.view.LayoutInflater
import com.convert.convertmp4tomp3andviceversa.databinding.ActivityMainBinding
import com.convert.convertmp4tomp3andviceversa.ui.splash.SplashFragment
import com.smartwavettn.horoscope.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getViewBinding(inflater: LayoutInflater): ActivityMainBinding {
        return  ActivityMainBinding.inflate(inflater)
    }

    override fun init() {
     openFragment(SplashFragment::class.java)
    }

}