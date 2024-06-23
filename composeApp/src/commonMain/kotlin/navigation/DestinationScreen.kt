package navigation

sealed class DestinationScreen(val route : String) {
    data object HomeScreen:DestinationScreen("homeScreen")
    data object SignUpScreen:DestinationScreen("SignUpScreen")
}