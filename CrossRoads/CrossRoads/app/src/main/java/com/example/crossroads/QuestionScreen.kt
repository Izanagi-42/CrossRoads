package com.example.crossroads

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun QuestionScreenOne(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center,
    ) {
        Column {
            Card(modifier = Modifier.clickable { navController.navigate(Screen.QuestionTwo.route) }) {
                Text(text = "Question 1")
            }
            Card(modifier = Modifier.clickable { navController.navigate(Screen.QuestionTwo.route) }) {
                Text(text = "Question 2")
            }
            Card(modifier = Modifier.clickable { navController.navigate(Screen.QuestionTwo.route) }) {
                Text(text = "Question 3")
            }
        }
    }
}

@Composable
fun QuestionScreenTwo(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center,
    ) {
        Column {
            Card(modifier = Modifier.clickable { navController.navigate(Screen.QuestionThree.route) }) {
                Text(text = "Question 4")
            }
            Card(modifier = Modifier.clickable { navController.navigate(Screen.QuestionThree.route) }) {
                Text(text = "Question 5")
            }
            Card(modifier = Modifier.clickable { navController.navigate(Screen.QuestionThree.route) }) {
                Text(text = "Question 6")
            }
        }
    }
}

@Composable
fun QuestionScreenThree(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center,
    ) {
        Column {
            Card(modifier = Modifier.clickable { navController.navigate(Screen.MainScreen.route) }) {
                Text(text = "Question 7")
            }
            Card(modifier = Modifier.clickable { navController.navigate(Screen.MainScreen.route) }) {
                Text(text = "Question 8")
            }
            Card(modifier = Modifier.clickable { navController.navigate(Screen.MainScreen.route) }) {
                Text(text = "Question 9")
            }
        }
    }
}