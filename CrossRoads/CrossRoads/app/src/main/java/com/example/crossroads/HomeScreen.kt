package com.example.crossroads

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(bottom = 80.dp),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Column {
                Column(modifier = Modifier.offset(5.dp)) {
                    Text(
                        text = "Hello User",
                        color = Color.Black,
                        fontSize = 35.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Good Day",
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.height(40.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(305.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "Suggested Path")
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row {
                        HomeCards(cardName = "Systems Dev", onClick = {/*TODO*/ })
                        HomeCards(cardName = "Business", onClick = { /*TODO*/ })
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        HomeCards(cardName = "Cyber Security", onClick = { /*TODO*/ })
                        HomeCards(cardName = "Digital Arts", onClick = { /*TODO*/ })
                    }
                }
            }
        }
    }
}

@Composable
fun HomeCards(cardName: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier
            .height(158.dp)
            .width(158.dp)
            .padding(8.dp)
            .clickable { onClick() }
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = cardName)
        }
    }
}