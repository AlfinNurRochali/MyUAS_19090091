package com.syahruladimustofa.myuas.ui.stokbarang

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StockbarangViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Tulis Catatan"
    }
    val text: LiveData<String> = _text
}