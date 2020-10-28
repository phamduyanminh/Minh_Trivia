package com.example.minh_trivia.database

import androidx.lifecycle.LiveData
import com.example.minh_trivia.model.Question

class QuestionRepository(private val questionDao: QuestionDAO) {
    val allQuestion: LiveData<List<Question>> = questionDao.getQuestion()

    suspend fun insertQuestion(question: Question){
        questionDao.insertQuestion(question)
    }
}