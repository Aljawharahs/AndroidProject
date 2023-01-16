package com.jeee.andoridproject2
import androidx.lifecycle.ViewModel

class LoginView: ViewModel() {

    private val Username = "Aljawharah"

    fun Check1(string: String) = Username  == string

}