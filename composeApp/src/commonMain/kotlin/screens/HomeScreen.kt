package screens

import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import navigation.DestinationScreen

@Composable
fun HomeScreen(
    navController: NavController
) {
    Text("HomeScreen")
    Button(
        onClick = { navController.navigate(DestinationScreen.SignUpScreen.route) }
    ){
        Text("Button")
    }
}