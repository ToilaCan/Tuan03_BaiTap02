

package com.example.t3_b2.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.t3_b2.R

@Composable
fun Screen4(navController: NavController) {
    OnBoardingScreen(
        imageRes = R.drawable.image4,
        title = "Reminder Notification",
        description = "The advantage of this application is that it also provides " +
                "reminders for you so you don't forget to keep doing your assignments " +
                "well and according to the time you have set",
        buttonText = "Get Started",
        navController = navController,
        nextScreen = "screen1", // Hoặc trang chính của app nếu có
        showBackButton = true // Hiển thị nút quay lại
    )
}
