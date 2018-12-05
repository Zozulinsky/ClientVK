package zo.den.clientvk.presentation.ui

import ru.terrakok.cicerone.android.support.SupportAppScreen
import zo.den.clientvk.presentation.ui.root.friends.FriendScreen
import zo.den.clientvk.presentation.ui.root.login.LoginScreen

object ScreenFactory{

    fun getFriendScreen(userId: Int? = null): SupportAppScreen {
        return FriendScreen(userId)
    }

    fun getLoginScreen(): SupportAppScreen{
        return LoginScreen()
    }
}