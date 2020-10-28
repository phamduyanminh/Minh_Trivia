package com.example.minh_trivia.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import  com.example.minh_trivia.R
import com.example.minh_trivia.model.Question


@Database(entities = [Question::class], version = 1)
abstract class MinhTriviaDatabase: RoomDatabase() {
    abstract fun questionDao(): QuestionDAO

    companion object{
        @Volatile
        private var INSTANCE: MinhTriviaDatabase? = null

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