package zo.den.clientvk.presentation.ui.root.login

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import zo.den.clientvk.presentation.base.BaseView

interface LoginView: BaseView {

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showLogin()

}