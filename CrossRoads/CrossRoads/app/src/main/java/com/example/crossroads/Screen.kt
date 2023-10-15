package com.example.crossroads

sealed class Screen(val route: String) {
    object Opening : Screen(route = "Opening")
    object Login : Screen(route = "Login")
    object SignUp : Screen(route = "SignUp" )
    object QuestionOne : Screen(route = "QuestionOne")
    object QuestionTwo : Screen(route = "QuestionTwo")
    object QuestionThree : Screen(route = "QuestionThree")
    object MainScreen : Screen(route = "MainScreen")
}
