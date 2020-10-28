/*Duy An Minh Pham - 991517388*/

package com.example.minh_trivia

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.minh_trivia.model.Question
import com.example.minh_trivia.viewmodel.QuestionViewModel
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity(), View.OnClickListener{
    val TAG = this@MainActivity.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlay.setOnClickListener(this)
    /*
         btnPlay.setOnClickListener{
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
            finish()
        }
    */
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                btnPlay.id ->{
                    try {
                        val questionViewModel = QuestionViewModel(application)
                        var questionList = Constants.getQuestions()
                        for (question in questionList){
                            questionViewModel.insertAll(question)
                        }
                    } catch (exception: Exception){
                        Log.d(TAG, exception.toString())
                        Log.d(TAG, exception.localizedMessage)
                    }
                    goToQuizActivity()
                }
            }
        }
    }

    fun goToQuizActivity(){
        val intent = Intent(this, QuizActivity::class.java)
        startActivity(intent)
        finish()
    }

}