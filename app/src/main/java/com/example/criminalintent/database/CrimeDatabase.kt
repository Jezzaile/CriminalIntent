package com.example.criminalintent.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.criminalintent.Crime

@Database(
    entities = [Crime::class],
    version = 1
)
@TypeConverters(CrimeTypeConverters::class)
abstract class CrimeDatabase: RoomDatabase(){
    abstract fun crimeDAO(): CrimeDAO
}