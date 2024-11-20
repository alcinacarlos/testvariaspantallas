package com.carlosalcina.testvariaspantallas.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.*
import androidx.navigation.compose.rememberNavController
import com.carlosalcina.testvariaspantallas.screens.FirstScreen
import com.carlosalcina.testvariaspantallas.screens.Secondcreen


@Composable
fun AppNavigation(){
    val navControlador = rememberNavController()
    
    NavHost(navController = navControlador, startDestination = AppScreen.FirstScreen.route) {
        composable(AppScreen.FirstScreen.route){
            FirstScreen(navControlador)
        }
        composable(AppScreen.SecondScreen.route){
            Secondcreen(navControlador)
        }
    }
}