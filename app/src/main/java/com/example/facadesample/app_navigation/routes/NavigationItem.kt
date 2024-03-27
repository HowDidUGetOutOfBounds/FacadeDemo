package com.example.facadesample.app_navigation.routes

sealed class NavigationItem(val route: String) {
    data object DashboardScreen: NavigationItem("dashboardScreen")
    data object MapScreen: NavigationItem("mapScreen")
    data object PointsScreen: NavigationItem("pointsScreen")
    data object SettingsScreen: NavigationItem("settingsScreen")
}