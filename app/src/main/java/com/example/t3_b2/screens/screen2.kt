

package com.example.t3_b2.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.t3_b2.R

@Composable
fun Screen2(navController: NavController) {
    OnBoardingScreen(
        imageRes = R.drawable.image2, // Thay bằng hình thật
        title = "Easy Time Management",
        description = "With management based on priority and daily tasks, " +
                "it will give you convenience in managing and determining " +
                "the tasks that must be done first",
        buttonText = "Next",
        navController = navController,
        nextScreen = "screen3"
    )
}
