package com.carlosalcina.testvariaspantallas.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.*
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.carlosalcina.testvariaspantallas.screens.FirstScreen
import com.carlosalcina.testvariaspantallas.screens.SecondScreen


@Composable
fun AppNavigation(){
    val navControlador = rememberNavController()
    
    NavHost(navController = navControlador, startDestination = AppScreen.FirstScreen.route) {
        composable(AppScreen.FirstScreen.route){
            FirstScreen(navControlador)
        }
        composable(
            route = AppScreen.SecondScreen.route + "/{text}",
            arguments = listOf(navArgument(name = "text"){
                type = NavType.StringType
            })
        ) {
            val argumento = it.arguments?.getString("text") ?: "Default Value"
            SecondScreen(navControlador, argumento)
        }
    }
}