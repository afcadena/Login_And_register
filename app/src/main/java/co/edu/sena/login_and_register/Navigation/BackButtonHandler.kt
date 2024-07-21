package co.edu.sena.login_and_register.Navigation

import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.activity.OnBackPressedDispatcherOwner
import androidx.compose.runtime.staticCompositionLocalOf

private val LocalBackPressDispatcher = staticCompositionLocalOf<OnBackPressedDispatcherOwner?> { null }



private class  ComposableBackNavigateHandler(enabled: Boolean) : OnBackPressedCallback(enabled){
    lateinit var onBackPressed: () -> Unit

    override fun handleOnBackPressed() {
        onBackPressed
    }
}