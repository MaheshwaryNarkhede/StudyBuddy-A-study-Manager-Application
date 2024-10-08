package com.example.studybuddy.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.studybuddy.domain.model.Session

import com.example.studybuddy.domain.model.Task


@TypeConverters(ColorListConverter::class)
abstract class AppDatabase: RoomDatabase() {


    abstract fun taskDao(): TaskDao
    abstract fun sessionDao(): SessionDao
}