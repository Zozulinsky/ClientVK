package zo.den.clientvk.presentation.ui.root.friends

import android.support.v4.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

class FriendScreen(private val userId: Int?) : SupportAppScreen() {
    override fun getFragment(): Fragment {
        return FriendFragment.getInstance(userId)
    }

    override fun getScreenKey(): String {
        return "${FriendFragment::class.java.name}_$userId"
    }
}
