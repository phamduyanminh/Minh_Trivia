package com.example.minh_trivia.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.minh_trivia.database.MinhTriviaDatabase
import com.example.minh_trivia.database.QuestionRepository
import com.example.minh_trivia.model.Question
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.launch


class QuestionViewModel(application: Application): AndroidViewModel(application){
    private val questionRepository: QuestionRepository
    var allQuestion: LiveData<List<Question>>

    init {
        val questionDAO = MinhTriviaDatabase.getDatabase(application).questionDao()
        questionRepository = QuestionRepository(questionDAO)
        allQuestion = questionRepository.allQuestion
    }

    fun insertAll(question: Question) = viewModelScope.launch(Dispatchers.IO){
        questionRepository.insertQuestion(question)
    }
}