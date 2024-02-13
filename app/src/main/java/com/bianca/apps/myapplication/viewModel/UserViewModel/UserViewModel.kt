package com.bianca.apps.myapplication.viewModel.UserViewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.bianca.apps.myapplication.model.User
import com.bianca.apps.myapplication.repository.UserRepository

class UserViewModel(private val userRepository: UserRepository): ViewModel() {

    //LiveData to hold the list of users
    private val _users= mutableStateOf<List<User>>(emptyList())
    val users: State<List<User>> = _users

    //Function to fetch users and update the LiveData
    fun getUsers(){
        _users.value=userRepository.getUsers()
    }
}