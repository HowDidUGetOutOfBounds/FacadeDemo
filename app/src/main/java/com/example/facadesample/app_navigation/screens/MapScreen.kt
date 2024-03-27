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
fun MapScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    action: () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.Blue)
            .clickable {
                action()
                navController.navigate(NavigationItem.SettingsScreen.route)
            }
    )
}

@Preview
@Composable
private fun MapScreenPreview() {
    FacadeSampleTheme {
        val navController = rememberNavController()
        MapScreen(
            navController = navController,
            action = {}
        )
    }
}