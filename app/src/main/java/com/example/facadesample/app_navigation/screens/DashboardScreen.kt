package com.example.facadesample.app_navigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.facadesample.app_navigation.routes.NavigationItem
import com.example.facadesample.ui.theme.FacadeSampleTheme

@Composable
fun DashboardScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    action: () -> Unit,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.Red)
            .clickable {
                action()
                navController.navigate(NavigationItem.PointsScreen.route)
            }
    )
}

@Preview(showBackground = true)
@Composable
private fun SplashScreenPreview() {
    val navController = rememberNavController()
    FacadeSampleTheme {
        DashboardScreen(
            navController = navController,
            action = {}
        )
    }
}