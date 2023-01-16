package com.jeee.andoridproject2
import androidx.lifecycle.ViewModel

class LoginView: ViewModel() {

    private val Username = "Aljawharah"
    private val Password = 5

    fun Check1(string: String) = Username  == string

    fun Check2(string: String) = string.length ==Password

}