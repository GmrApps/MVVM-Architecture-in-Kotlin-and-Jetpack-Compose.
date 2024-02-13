package com.bianca.apps.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.tooling.preview.Preview
import com.bianca.apps.myapplication.repository.UserRepository
import com.bianca.apps.myapplication.ui.theme.MyApplicationTheme
import com.bianca.apps.myapplication.uiScreens.DisplayUsers
import com.bianca.apps.myapplication.viewModel.UserViewModel.UserViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
               DisplayUsers(viewModel = UserViewModel(userRepository = UserRepository()))
            }
        }
    }
}

