package com.example.crossroads

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Login.route) {
        composable(
            route = Screen.Opening.route
        ) {
            OpeningScreen(navController = navController)
        }
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ) {
            SignUpScreen(navController = navController)
        }
        composable(
            route = Screen.QuestionOne.route
        ) {
            QuestionScreenOne(navController = navController)
        }
        composable(
            route = Screen.QuestionTwo.route
        ) {
            QuestionScreenTwo(navController = navController)
        }
        composable(
            route = Screen.QuestionThree.route
        ) {
            QuestionScreenThree(navController = navController)
        }
        composable(
            route = Screen.MainScreen.route
        ) {
            MainScreen()
        }
        composable(
            route = BotNavScreen.Settings.route
        ) {
            SettingsScreen(navController = navController)
        }
    }
}