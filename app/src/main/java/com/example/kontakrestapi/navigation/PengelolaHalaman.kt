package com.example.kontakrestapi.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kontakrestapi.kontak.screen.DestinasiEntry
import com.example.kontakrestapi.kontak.screen.EntryKontakScreen
import com.example.kontakrestapi.ui.home.screen.DestinasiHome
import com.example.kontakrestapi.ui.home.screen.HomeScreen

@Composable
fun PengelolaHalaman(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier,
    ) {
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route) },
                onDetailClick = {}
            )
        }
        composable(DestinasiEntry.route) {
            EntryKontakScreen(navigateBack = {
                navController.navigate(DestinasiHome.route) {
                    popUpTo(DestinasiHome.route) {
                        inclusive = true
                    }
                }
            })
        }
    }
}


