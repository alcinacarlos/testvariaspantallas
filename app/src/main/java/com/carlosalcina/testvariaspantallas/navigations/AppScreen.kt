package com.carlosalcina.testvariaspantallas.navigations

sealed class AppScreen(val route: String) {
    object FirstScreen: AppScreen("FirstScreen")
    object SecondScreen : AppScreen("SecondScreen")
}