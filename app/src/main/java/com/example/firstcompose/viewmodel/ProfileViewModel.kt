package com.example.firstcompose.viewmodel

import androidx.lifecycle.ViewModel
import com.example.firstcompose.models.ProfileState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

@HiltViewModel
class ProfileViewModel:ViewModel(){
    private val _state = MutableStateFlow(ProfileState())
    val state = _state.asStateFlow()

    init {
        getData()
    }

    private fun getData(){
        _state.update { it.copy(profilePicLink = "https://img.freepik.com/free-photo/red-roses-by-window-brought-touch-romance-room-generative-ai_8829-2925.jpg?w=360&t=st=1694966181~exp=1694966781~hmac=e61fdb45b0f66576fc0ed2d5e6a26d97835bf0bfc97194791bb5525d0b001434") }
    }

    fun onChangeFirstName(newValue:String){
        _state.update { it.copy(firstName = newValue) }
    }
    fun onChangeLastName(newValue:String){
        _state.update { it.copy(lastName = newValue) }
    }
    fun onChangeLocation(newValue:String){
        _state.update { it.copy(location = newValue) }
    }
    fun onChangeEmail(newValue:String){
        _state.update { it.copy(email = newValue) }
    }
    fun onChangePhone(newValue:String){
        _state.update { it.copy(phone = newValue) }
    }
    fun saveUserInfo(){

    }

}