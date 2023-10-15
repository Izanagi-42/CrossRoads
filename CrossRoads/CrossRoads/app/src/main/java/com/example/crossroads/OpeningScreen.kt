package com.example.crossroads

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun OpeningScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(modifier = Modifier.offset(25.dp, 350.dp)) {
            Text(
                text = "Navigate",
                color = Color(0.20f, 0.22f, 0.23f, 0.7f),
                fontWeight = FontWeight.Bold,
                fontSize = 45.sp,
                fontFamily = FontFamily.SansSerif
            )
            Text(
                text = "Your",
                color = Color(0.20f, 0.22f, 0.23f, 0.7f),
                fontWeight = FontWeight.Bold,
                fontSize = 45.sp,
                fontFamily = FontFamily.SansSerif
            )
            Text(
                text = "IT Career",
                fontWeight = FontWeight.Bold,
                fontSize = 45.sp,
                fontFamily = FontFamily.SansSerif
            )
            Text(
                text = "With Precision",
                fontWeight = FontWeight.Bold,
                fontSize = 45.sp,
                fontFamily = FontFamily.SansSerif
            )
            Spacer(modifier = Modifier.height(40.dp))
            Button(
                onClick = { navController.navigate(Screen.Login.route) },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                contentPadding = PaddingValues(90.dp, 20.dp),
                shape = RoundedCornerShape(40.dp)
            ) {
                Text(
                    text = "Get Started", color = Color.White, fontSize = 25.sp
                )
            }
        }
    }
}