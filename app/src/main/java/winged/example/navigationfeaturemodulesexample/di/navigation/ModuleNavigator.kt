package winged.example.navigationfeaturemodulesexample.di.navigation

import androidx.navigation.NavController
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import winged.example.featuremoduleone.navigation.NavigationFeatureOne
import winged.example.featuremoduletwo.navigation.NavigationFeatureTwo
import winged.example.navigationfeaturemodulesexample.MainNavDirections
import javax.inject.Inject

@ActivityScoped
class ModuleNavigator @Inject constructor(
    private val navController: NavController
): NavigationFeatureOne, NavigationFeatureTwo {
    override fun navigateToFeatureTwo() {
        navController.navigate(MainNavDirections.actionToFeatureTwo())
    }

    override fun navigateToFeatureOne() {
        navController.navigate(MainNavDirections.actionToFeatureOne())
    }

    @Module
    @InstallIn(ActivityComponent::class)
    abstract class ActionsHandler {
        @Binds
        abstract fun featureOne(moduleNavigator: ModuleNavigator): NavigationFeatureOne

        @Binds
        abstract fun featureTwo(moduleNavigator: ModuleNavigator): NavigationFeatureTwo
    }
}