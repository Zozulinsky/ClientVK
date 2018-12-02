package zo.den.clientvk.data

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class DataQualifier(val name: String = "")