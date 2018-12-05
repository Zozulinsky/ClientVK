package zo.den.clientvk.presentation.ui.root.friends
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import kotlinx.android.synthetic.main.fragment_friend.*
import zo.den.clientvk.R
import zo.den.clientvk.presentation.base.MoxyFragment
import zo.den.clientvk.presentation.ui.adapter.FriendAdapter
import zo.den.clientvk.presentation.model.FriendModel
import javax.inject.Inject
import javax.inject.Provider
class FriendFragment : MoxyFragment(),FriendView {
    companion object {
        private const val KEY_USER_ID = "KEY_USER_ID"
        fun getInstance(userId: Int?) = FriendFragment().also {
            it.arguments = Bundle().apply {
                putInt(KEY_USER_ID, userId ?: -1)
            }
        }
    }

    override val layout: Int = R.layout.fragment_friend

    val userId: Int
        get() = arguments?.getInt(KEY_USER_ID) ?: -1

    @field:Inject
    lateinit var presenterProvider: Provider<FriendPresenter>

    @ProvidePresenter
    fun providePresenter(): FriendPresenter = presenterProvider.get()

    @InjectPresenter
    lateinit var presenter: FriendPresenter

    @field:Inject
    @field:FriendQualifier
    lateinit var friendAdapter: FriendAdapter

    override fun onViewPrepare(savedInstanceState: Bundle?) {
        super.onViewPrepare(savedInstanceState)
        friend_list.adapter = friendAdapter
        friend_list.layoutManager = LinearLayoutManager(context)
    }

    override fun showFriendList(list: List<FriendModel>) {
        friendAdapter.list = list
    }
}