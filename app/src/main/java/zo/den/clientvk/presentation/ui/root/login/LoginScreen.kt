package zo.den.clientvk.presentation.ui.root.login

import android.support.v4.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

class LoginScreen : SupportAppScreen() {

    override fun getFragment(): Fragment {
        return LoginFragment.getInstance()
    }

    override fun getScreenKey(): String {
        return LoginFragment::class.java.name
    }
}