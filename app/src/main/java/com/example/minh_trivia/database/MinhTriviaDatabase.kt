package com.example.minh_trivia.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class MinhTriviaDatabase: RoomDatabase() {
    abstract fun userDao(): UserDAO

    companion object{
        @Volatile
        private var INSTANCE: MinhTriviaDatabase? = null
        @InternalCoroutinesApi
        fun getDatabase(context: Context): MinhTriviaDatabase{
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return  tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MinhTriviaDatabase::class.java,
                        "user_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }

    }
}