package com.dineshprabha.cameraxapp

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private val _bitmaps = MutableStateFlow<List<Bitmap>>(emptyList())
    val bitmap = _bitmaps.asStateFlow()


    fun onTakePhoto(bitmap: Bitmap){
        _bitmaps.value += bitmap
    }

    fun onVideoCapture(bitmap: Bitmap){
        _bitmaps.value += bitmap
    }
}