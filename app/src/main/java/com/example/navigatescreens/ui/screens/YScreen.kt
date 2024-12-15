//Created by canVarli on 12/15/2024

package com.example.navigatescreens.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.activity.compose.BackHandler

@Composable
fun YScreen(navController: NavHostController) {
    // Cihazın geri tuşu için özel davranış tanımlıyoruz.
    BackHandler {
        navController.popBackStack("mainScreen", inclusive = false) // Ana ekrana döner.
    }

    // Ekranın içeriği
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Y Screen")
    }
}