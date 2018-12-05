package zo.den.clientvk.di

import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Router
import zo.den.clientvk.presentation.ui.root.MainQualififer
import javax.inject.Singleton

@Module
class RouterModule {

    @Provides
    @MainQualififer
    @Singleton
    fun provideMainRouter(): Router = Router()
}