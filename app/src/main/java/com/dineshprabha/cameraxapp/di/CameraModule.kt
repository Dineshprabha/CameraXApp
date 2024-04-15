package com.dineshprabha.cameraxapp.di

import com.dineshprabha.cameraxapp.data.repository.CameraRepositoryImpl
import com.dineshprabha.cameraxapp.domain.repository.CameraRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class CameraModule {

    @Binds
    @Singleton
    abstract fun bindCameraRepository(
        cameraRepositoryImpl: CameraRepositoryImpl
    ):CameraRepository

}