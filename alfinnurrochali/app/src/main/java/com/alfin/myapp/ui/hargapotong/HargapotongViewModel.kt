package com.alfin.myapp.ui.hargapotong

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HargapotongViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Tulis Catatan"
    }
    val text: LiveData<String> = _text
}