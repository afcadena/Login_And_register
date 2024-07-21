package co.edu.sena.login_and_register.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import co.edu.sena.login_and_register.Navigation.PostOfficeAppRouter
import co.edu.sena.login_and_register.Navigation.Screen
import co.edu.sena.login_and_register.paginas.LoginScreen
import co.edu.sena.login_and_register.paginas.PaginaInicioSesion
import co.edu.sena.login_and_register.paginas.TermsAndConditionsScreen

@Composable
fun PostOfficeApp(){
    Surface(modifier = Modifier.fillMaxSize(),
    color = Color.White



) {
        Crossfade(targetState = PostOfficeAppRouter.currentScreen) { currentState ->
            when (currentState.value) {
                is Screen.PaginaInicioSesion -> {
                    PaginaInicioSesion()
                }
                is Screen.TermsandConditionsScreen -> {
                    TermsAndConditionsScreen()
                }
                is Screen.LoginScreen ->{
                    LoginScreen()
                }
            }
        }
    }
}
