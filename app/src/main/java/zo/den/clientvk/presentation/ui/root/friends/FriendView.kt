package zo.den.clientvk.presentation.ui.root.friends

import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import zo.den.clientvk.presentation.base.BaseView
import zo.den.clientvk.presentation.model.FriendModel

interface FriendView : BaseView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showFriendList(list: List<FriendModel>)

}