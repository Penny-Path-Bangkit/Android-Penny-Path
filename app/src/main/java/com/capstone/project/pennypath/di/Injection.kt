package com.capstone.project.pennypath.di

import android.content.Context
import com.capstone.project.pennypath.data.UserRepository
import com.capstone.project.pennypath.data.pref.UserPreference
import com.capstone.project.pennypath.data.pref.dataStore

object Injection {
    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        return UserRepository.getInstance(pref)
    }
}