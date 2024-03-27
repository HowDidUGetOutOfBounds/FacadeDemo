package com.example.facadesample.app_navigation.routes

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.facadesample.app_navigation.screens.DashboardScreen
import com.example.facadesample.app_navigation.screens.MapScreen
import com.example.facadesample.app_navigation.screens.PointsScreen
import com.example.facadesample.app_navigation.screens.SettingsScreen
import com.example.facadesample.viewmodels.AppViewModel

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = NavigationItem.DashboardScreen.route,
) {
    val viewModel = hiltViewModel<AppViewModel>()

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(NavigationItem.DashboardScreen.route) {
            DashboardScreen(
                navController = navController,
                action = {
                    viewModel.writeWarning("1")
                }
            )
        }
        composable(NavigationItem.MapScreen.route) {
            MapScreen(
                navController = navController,
                action = {
                    viewModel.writeDebugLog("2")
                }
            )
        }
        composable(NavigationItem.PointsScreen.route) {
            PointsScreen(
                navController = navController,
                action = {
                    viewModel.writeFatalLog("3")
                })
        }
        composable(NavigationItem.SettingsScreen.route) {
            SettingsScreen(
                navController = navController,
                action = {
                    viewModel.writeNonFatalLog("4")
                })
        }
    }
}