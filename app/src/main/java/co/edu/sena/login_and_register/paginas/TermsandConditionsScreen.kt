package co.edu.sena.login_and_register.paginas


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
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

@Composable
fun TermsAndConditionsScreen(){
   Surface (modifier = Modifier
       .fillMaxWidth()
       .background(color = Color.White)
       .padding(16.dp)){

       HeadingTextComponent(value = stringResource(id = R.string.terms_and_conditions_header))
   }
}

@Preview
@Composable
fun TermsAndConditionsScreenPreview(){
    TermsAndConditionsScreen()
}