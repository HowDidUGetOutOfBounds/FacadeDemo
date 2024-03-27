package com.example.facadesample.app_navigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.facadesample.app_navigation.routes.NavigationItem
import com.example.facadesample.ui.theme.FacadeSampleTheme

@Composable
fun PointsScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    action: () -> Unit
) {
    Text(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.Green)
            .clickable {
                action()
                navController.navigate(NavigationItem.MapScreen.route)
            },
        text = "PointsScreen"
    )
}

@Preview(showBackground = true)
@Composable
private fun PointsScreenPreview() {
    val navController = rememberNavController()
    FacadeSampleTheme {
        PointsScreen(
            navController = navController,
            action = {}
        )
    }
}