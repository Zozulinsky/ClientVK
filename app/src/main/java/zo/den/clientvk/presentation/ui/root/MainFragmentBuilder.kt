package zo.den.clientvk.presentation.ui.root

import dagger.Module
import dagger.android.ContributesAndroidInjector
import zo.den.clientvk.presentation.ui.root.friends.FriendFragment
import zo.den.clientvk.presentation.ui.root.friends.FriendModule
import zo.den.clientvk.presentation.ui.root.friends.FriendScope
import zo.den.clientvk.presentation.ui.root.login.LoginFragment

@Module
abstract class MainFragmentBuilder {

    @ContributesAndroidInjector(modules = [FriendModule::class])
    @FriendScope
    abstract fun buildFriendFragment(): FriendFragment

    @ContributesAndroidInjector
    abstract fun buildLoginFragment(): LoginFragment

}