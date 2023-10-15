package com.example.crossroads

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BotNavScreen(
    val route: String, val title: String, val icon: ImageVector
) {
    object Home : BotNavScreen("home", "Home", Icons.Default.Home)
    object Profile : BotNavScreen("profile", "Profile", Icons.Default.Person)
    object Settings : BotNavScreen("settings", "Settings", Icons.Default.Settings)
}

