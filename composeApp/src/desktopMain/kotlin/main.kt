import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import navigation.DIONavigation

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "DecentralisedIO",
    ) {
        DIONavigation()
    }
}