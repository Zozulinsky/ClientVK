package zo.den.clientvk.presentation.ui.root.login

import com.arellomobile.mvp.InjectViewState
import ru.terrakok.cicerone.Router
import zo.den.clientvk.data.dao.CredentialsDao
import zo.den.clientvk.presentation.base.MoxyPresenter
import zo.den.clientvk.presentation.ui.ScreenFactory
import zo.den.clientvk.presentation.ui.root.MainQualififer
import javax.inject.Inject

@InjectViewState
class LoginPresenter @Inject constructor() : MoxyPresenter<LoginView>() {

    @Inject
    lateinit var credentialsDao: CredentialsDao
    @Inject
    @field:MainQualififer
    lateinit var router: Router

    fun onSignIn() {
        viewState.showLogin()
    }

    fun onTokenReceive(userId: String, token: String) {
        credentialsDao.saveToken(CredentialsDao.VkToken(userId, token))
                .subscribe {
                    router.newRootScreen(ScreenFactory.getFriendScreen())
                }.toCompositeDisposable()
    }

    fun onError(code: Int){

    }

}