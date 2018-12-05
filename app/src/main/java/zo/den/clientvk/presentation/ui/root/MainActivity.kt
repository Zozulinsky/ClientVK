package zo.den.clientvk.presentation.ui.root

import android.os.Bundle
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.NavigatorHolder
import zo.den.clientvk.R
import zo.den.clientvk.presentation.base.DiMoxyActivity
import javax.inject.Inject
import javax.inject.Provider

class MainActivity : DiMoxyActivity(), MainView {

    override val layout: Int = R.layout.activity_main

    val containerId: Int = R.id.container

    @Inject
    @field:MainQualififer
    lateinit var navigatorHolder: NavigatorHolder
    @Inject
    @field:MainQualififer
    lateinit var navigator: Navigator
    @Inject
    lateinit var presenterProvider: Provider<MainPresenter>
    @InjectPresenter
    lateinit var presenter: MainPresenter

    @ProvidePresenter
    fun providePresenter(): MainPresenter = presenterProvider.get()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.onCreate(savedInstanceState != null)
    }

    override fun onViewPrepare(savedInstanceState: Bundle?) {
        super.onViewPrepare(savedInstanceState)
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }

}