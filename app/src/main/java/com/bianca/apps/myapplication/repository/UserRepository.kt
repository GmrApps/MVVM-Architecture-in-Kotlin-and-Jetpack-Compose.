package com.bianca.apps.myapplication.repository

import com.bianca.apps.myapplication.model.User

class UserRepository {

    fun getUsers(): List<User>{
        return listOf(
            User(0,"john","john@yahoo.com"),
            User(1,"David","david@gmail.com"),
            User(2,"Alex","alex@hotmail.com"),
            User(3,"Ronaldo","ronaldo@hotmail.com"),
            User(4,"Smith","smith@hotmail.com")
        )
    }
}