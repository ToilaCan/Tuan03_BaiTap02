

package com.example.t3_b2.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.t3_b2.R

@Composable
fun Screen3(navController: NavController) {
    OnBoardingScreen(
        imageRes = R.drawable.image3,
        title = "Increase Work Effectiveness",
        description = "Time management and the determination of more important tasks " +
                "will give your job statistics better and always improve.",
        buttonText = "Next",
        navController = navController,
        nextScreen = "screen4",
        showBackButton = true // Hiển thị nút quay lại
    )
}
