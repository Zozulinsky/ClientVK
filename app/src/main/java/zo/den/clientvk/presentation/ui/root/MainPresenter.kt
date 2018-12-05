package zo.den.clientvk.presentation.ui.root

import com.arellomobile.mvp.InjectViewState
import io.reactivex.functions.Consumer
import ru.terrakok.cicerone.Router
import zo.den.clientvk.data.dao.CredentialsDao
import zo.den.clientvk.presentation.base.MoxyPresenter
import zo.den.clientvk.presentation.ui.ScreenFactory
import javax.inject.Inject

@InjectViewState
class MainPresenter @Inject constructor() : MoxyPresenter<MainView>() {

    @Inject
    @field:MainQualififer
    lateinit var router: Router

    @Inject
    lateinit var credentialsDao: CredentialsDao

    fun onCreate(isRestore: Boolean) {
        if (!isRestore)
            credentialsDao.isTokenExists().subscribe(Consumer {
                if (it)
                    router.newRootScreen(ScreenFactory.getFriendScreen())
                else
                    router.newRootScreen(ScreenFactory.getLoginScreen())
            }).toCompositeDisposable()
    }

}