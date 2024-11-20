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
fun SecondScreen(navController: NavController, texto: String?) {
    SecondBody(navController, texto)
}

@Composable
fun SecondBody(navController: NavController, texto: String?) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        println(texto)
        texto?.let {
            Text(it)
        }
        Text("Holaa 2")
        Button(onClick = { navController.navigate(route = AppScreen.FirstScreen.route) }) {
            Text("Ir a 1")
        }
    }
}