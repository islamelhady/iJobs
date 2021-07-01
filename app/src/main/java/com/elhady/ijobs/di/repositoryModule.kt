package com.elhady.ijobs.di

import com.elhady.ijobs.data.repository.IjobRepository
import org.koin.dsl.module

/**
 * Created by islam elhady on 24-Mar-21.
 */
val repositoryModule = module {
    single {
        IjobRepository(get())
    }
}