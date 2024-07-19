package co.edu.sena.login_and_register.paginas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.sena.login_and_register.R
import co.edu.sena.login_and_register.componentes.HeadingTextComponent
import co.edu.sena.login_and_register.componentes.NormalTextComponent


@Composable
fun PaginaInicioSesion() {

    Surface(color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.Hello))
            HeadingTextComponent(value = stringResource(id = R.string.create))
        }

    }

}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    PaginaInicioSesion()
}