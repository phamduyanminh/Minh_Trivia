/*Duy An Minh Pham - 991517388*/

package com.example.minh_trivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity(), View.OnClickListener{

    private var currentPosition: Int = 1
    private var questionList: ArrayList<Question>? = null
    private var selectedOption: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        questionList = Constants.getQuestions()

        setQuestion()

        radioOption1.setOnClickListener(this)
        radioOption2.setOnClickListener(this)
        radioOption3.setOnClickListener(this)
        radioOption4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.radioOption1 ->{
                radioButtonSelected(1)
            }
            R.id.radioOption2 ->{
                radioButtonSelected(2)
            }
            R.id.radioOption3 ->{
                radioButtonSelected(3)
            }
            R.id.radioOption4 ->{
                radioButtonSelected(4)
            }
        }
    }

    private fun setQuestion(){

        val question: Question? = questionList!![currentPosition -1]

        tvQuestion.text = question!!.question
        radioOption1.text = question!!.optionOne
        radioOption2.text = question!!.optionTwo
        radioOption3.text = question!!.optionThree
        radioOption4.text = question!!.optionFour
    }

    private fun radioButtonSelected(selectedOptionNumber: Int){
        selectedOption = selectedOptionNumber
    }

}