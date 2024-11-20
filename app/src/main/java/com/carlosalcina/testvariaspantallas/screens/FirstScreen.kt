package com.carlosalcina.testvariaspantallas.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.carlosalcina.testvariaspantallas.navigations.AppScreen

@Composable
fun FirstScreen(navController: NavController){
    FirstBody(navController)
}

@Composable
fun FirstBody(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Holaa")
        Button(onClick = {navController.navigate(route = AppScreen.SecondScreen.route)}) {
            Text("Ir a 2")
        }
    }
}