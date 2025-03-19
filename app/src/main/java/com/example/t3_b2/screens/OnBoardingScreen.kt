package com.example.t3_b2.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.t3_b2.R

@Composable
fun OnBoardingScreen(
    imageRes: Int,
    title: String,
    description: String,
    buttonText: String,
    navController: NavController,
    nextScreen: String,
    showBackButton: Boolean = false,
    buttonColor: Color = Color(0xFF1E88E5) // Màu mặc định giống Next & Get Started
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "OnBoarding Image",
            modifier = Modifier
                .size(320.dp)
                .weight(1f)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = title,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = description,
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 20.dp)
        )

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            if (showBackButton) {
                IconButton(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier
                        .size(50.dp)
                        .background(buttonColor, shape = CircleShape) // Đặt màu nền và bo tròn
                        .padding(4.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_back),
                        contentDescription = "Back Button",
                        tint = Color.White // Đảm bảo màu icon trắng để nổi bật
                    )
                }
                Spacer(modifier = Modifier.width(16.dp)) // Tăng khoảng cách giữa 2 nút
            }

            Button(
                onClick = { navController.navigate(nextScreen) },
                modifier = Modifier
                    .weight(1f)
                    .height(50.dp), // Giữ nguyên chiều rộng, giảm chiều dài
                colors = ButtonDefaults.buttonColors(containerColor = buttonColor)
            ) {
                Text(text = buttonText, fontSize = 18.sp)
            }
        }
        Spacer(modifier = Modifier.navigationBarsPadding())
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewOnBoardingScreen() {
    val navController = rememberNavController()
    OnBoardingScreen(
        imageRes = R.drawable.ic_launcher_foreground,
        title = "Easy Time Management",
        description = "Manage your tasks efficiently and prioritize them wisely.",
        buttonText = "Next",
        navController = navController,
        nextScreen = "screen3",
        showBackButton = true
    )
}
