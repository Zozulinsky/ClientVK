package zo.den.clientvk.presentation.ui.root.friends

import com.arellomobile.mvp.InjectViewState
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import zo.den.clientvk.data.dao.FriendsDao
import zo.den.clientvk.presentation.base.MoxyPresenter
import zo.den.clientvk.presentation.mapper.FriendModelMapper
import javax.inject.Inject

@InjectViewState
class FriendPresenter@Inject constructor() : MoxyPresenter<FriendView>() {

    @field:Inject
    @field:JvmField
    @field:FriendQualifier("userId")
    var userId: Int = 0

    @field:Inject
    lateinit var friendsDao: FriendsDao

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        friendsDao.getFriends(if (userId > 0) userId else null)
                .map(FriendModelMapper())
                .toList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    viewState.showFriendList(it)
                }, {
                    it.printStackTrace()
                }).toCompositeDisposable()
    }

}