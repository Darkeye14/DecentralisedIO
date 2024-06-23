package navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import screens.HomeScreen
import screens.SignUp


@Composable
fun DIONavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = DestinationScreen.HomeScreen.route
    ){
        composable(DestinationScreen.HomeScreen.route){
            HomeScreen(navController)
        }
        composable(DestinationScreen.SignUpScreen.route){
            SignUp()
        }
    }
}