package co.edu.sena.login_and_register.Navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf



sealed class Screen(){
    data object PaginaInicioSesion : Screen()
    data object TermsandConditionsScreen : Screen()
    data object LoginScreen : Screen()
}

object PostOfficeAppRouter {
    val currentScreen : MutableState<Screen> = mutableStateOf(Screen.PaginaInicioSesion)

    fun navigateTo(destination : Screen){
        currentScreen.value = destination
}
}
