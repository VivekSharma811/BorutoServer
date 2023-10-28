package com.hyphen.di

import com.hyphen.repository.HeroRepository
import com.hyphen.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}
