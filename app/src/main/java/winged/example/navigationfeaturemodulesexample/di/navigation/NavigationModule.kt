package winged.example.navigationfeaturemodulesexample.di.navigation

import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import winged.example.navigationfeaturemodulesexample.R

// probably could be nested in app module, but some separation of concerns would not hurt I believe
@Module
@InstallIn(ActivityComponent::class)
object NavigationModule {
    @Provides
    fun navController(activity: FragmentActivity): NavController {
        return NavHostFragment.findNavController(
            activity.supportFragmentManager.findFragmentById(R.id.fragmentContainerView)!!
        )
    }
}