package com.isu.movieapp.navagation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.isu.movieapp.screens.details.DetailsScreen
import com.isu.movieapp.screens.home.HomeScreen

@Composable
fun MovieNavigation(){
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = MovieScreens.HomeScreen.name){
        composable(MovieScreens.HomeScreen.name){
            HomeScreen(navController = navController)
        }
        composable(MovieScreens.DetailsScreen.name+"/{id}",
        arguments = listOf(navArgument(name = "id") {type = NavType.StringType})) {
            backStackEntry ->

        DetailsScreen(navController = navController,
            backStackEntry.arguments?.getString("id"))
    }
    }
}