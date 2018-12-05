package zo.den.clientvk.presentation.ui.root.friends

import dagger.Module
import dagger.Provides
import zo.den.clientvk.presentation.ui.adapter.FriendAdapter

@Module
class FriendModule {
    @Provides
    @FriendQualifier
    fun provideFriendAdapter(): FriendAdapter = FriendAdapter()

    @Provides
    @FriendQualifier("userId")
    fun provideUserId(friendFragment: FriendFragment): Int = friendFragment.userId

}