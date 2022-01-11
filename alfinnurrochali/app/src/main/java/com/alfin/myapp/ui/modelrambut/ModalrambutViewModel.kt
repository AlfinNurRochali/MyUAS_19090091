package com.alfin.myapp.ui.modelrambut

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ModalrambutViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Riwayat"
    }
    val text: LiveData<String> = _text
}