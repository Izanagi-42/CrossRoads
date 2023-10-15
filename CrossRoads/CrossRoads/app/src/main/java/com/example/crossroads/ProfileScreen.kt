package com.example.crossroads

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(bottom = 90.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            UserInfo()
            Spacer(modifier = Modifier.height(30.dp))
            RepeatCard()
            Spacer(modifier = Modifier.height(20.dp))
            RepeatCard()
            Spacer(modifier = Modifier.height(20.dp))
            RepeatCard()
        }
    }
}

@Composable
fun UserInfo() {
    Text(
        text = "User Name",
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
    Text(text = "Mini Text", fontSize = 15.sp, color = Color.Black)
}

@Composable
fun RepeatCard() {
    Card(
        modifier = Modifier
            .height(100.dp)
            .width(300.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = "Password Button",
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = "Placeholder",
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
