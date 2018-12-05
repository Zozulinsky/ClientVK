package zo.den.clientvk.presentation.ui.root.friends

import javax.inject.Qualifier


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class FriendQualifier(val name: String = "")