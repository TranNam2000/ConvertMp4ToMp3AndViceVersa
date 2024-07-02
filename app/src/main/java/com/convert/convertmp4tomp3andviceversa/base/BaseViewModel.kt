package com.convert.convertmp4tomp3andviceversa.base

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.smartwavettn.horoscope.base.Repository

abstract class BaseViewModel() : ViewModel() {
    val isLoading: MutableLiveData<Boolean> = MutableLiveData(false)
    protected lateinit var repository: Repository
    protected lateinit var context : Context

}