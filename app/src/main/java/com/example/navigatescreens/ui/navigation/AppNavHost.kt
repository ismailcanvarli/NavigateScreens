//Created by canVarli on 12/15/2024

package com.example.navigatescreens.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigatescreens.ui.screens.AScreen
import com.example.navigatescreens.ui.screens.BScreen
import com.example.navigatescreens.ui.screens.MainScreen
import com.example.navigatescreens.ui.screens.XScreen
import com.example.navigatescreens.ui.screens.YScreen

@Composable
fun AppNavHost(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "mainScreen") {
        composable("mainScreen") {
            MainScreen(navController = navController)
        }
        composable("aScreen") {
            AScreen(navController = navController)
        }
        composable("bScreen") {
            BScreen(navController = navController)
        }
        composable("xScreen") {
            XScreen(navController = navController)
        }
        composable("yScreen") {
            YScreen(navController = navController)
        }
    }
}