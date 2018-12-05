package zo.den.clientvk.presentation.ui.root.login

import android.content.Intent
import android.os.Bundle
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.vk.sdk.VKAccessToken
import com.vk.sdk.VKCallback
import com.vk.sdk.VKScope
import com.vk.sdk.VKSdk
import com.vk.sdk.api.VKError
import kotlinx.android.synthetic.main.fragment_login.*
import zo.den.clientvk.presentation.base.MoxyFragment
import javax.inject.Inject
import javax.inject.Provider
import zo.den.clientvk.R

class LoginFragment : MoxyFragment(), LoginView, VKCallback<VKAccessToken> {
    override fun showLogin() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        fun getInstance() = LoginFragment()
    }

    override val layout: Int = R.layout.fragment_login

    @Inject
    lateinit var presenterProvider: Provider<LoginPresenter>

    @InjectPresenter
    lateinit var presenter: LoginPresenter

    @ProvidePresenter
    fun providePresenter(): LoginPresenter = presenterProvider.get()

    override fun onViewPrepare(savedInstanceState: Bundle?) {
        super.onViewPrepare(savedInstanceState)
        sign_in.setOnClickListener {
            presenter.onSignIn()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        VKSdk.onActivityResult(requestCode, resultCode, data, this)
    }

    /*
    override fun showLogin() {
        VKSdk.login(this, VKScope.OFFLINE, VKScope.FRIENDS, VKScope.MESSAGES)
    }*/

    override fun onError(error: VKError) {
        presenter.onError(error.errorCode)
    }

    override fun onResult(res: VKAccessToken) {
        presenter.onTokenReceive(res.userId, res.accessToken)
    }


}