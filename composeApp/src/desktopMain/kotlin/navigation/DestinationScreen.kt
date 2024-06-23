package navigation

sealed class DestinationScreen(var route : String)  {
    data object HomeScreen:DestinationScreen("homeScreen")
    data object SignUpScreen:DestinationScreen("SignUpScreen")
}