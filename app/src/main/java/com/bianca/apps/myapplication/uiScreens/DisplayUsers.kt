package com.bianca.apps.myapplication.uiScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.bianca.apps.myapplication.viewModel.UserViewModel.UserViewModel

@Composable


fun DisplayUsers (
    viewModel: UserViewModel

){
    //Fetch users when the Composable is first launched

    LaunchedEffect(Unit){
        viewModel.getUsers()
    }
    val users by viewModel.users


    Surface(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {

        LazyColumn(){
            items(users){user ->

                Box(modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize()
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.LightGray)

                ){
                    Column {
                        Text(
                            text = "Name: ${user.name}",
                            color=Color.Black
                        )
                        Text(
                            text = "Email: ${user.email}",
                            color=Color.Black
                        )


                    }


                }


            }
        }

    }



}
