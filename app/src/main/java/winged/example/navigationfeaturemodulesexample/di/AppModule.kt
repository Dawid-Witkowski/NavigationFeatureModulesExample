package winged.example.navigationfeaturemodulesexample.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import winged.example.navigationfeaturemodulesexample.di.navigation.NavigationModule

@Module(includes = [NavigationModule::class])
@InstallIn(SingletonComponent::class)
object AppModule