package com.example.minh_trivia.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.minh_trivia.model.Question

@Dao
interface QuestionDAO {
    @Query("SELECT * FROM question_table")
    fun getQuestion(): LiveData<List<Question>>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertQuestion(vararg question: Question)
}