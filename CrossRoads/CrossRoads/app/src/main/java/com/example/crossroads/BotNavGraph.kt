package com.example.crossroads

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BotNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BotNavScreen.Home.route) {
        composable(
            route = BotNavScreen.Home.route
        ) {
            HomeScreen()
        }
        composable(
            route = BotNavScreen.Profile.route
        ) {
            ProfileScreen()
        }
        composable(
            route = BotNavScreen.Settings.route
        ) {
            SettingsScreen(navController = navController)
        }
    }
}