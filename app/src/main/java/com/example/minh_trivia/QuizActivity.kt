/*Duy An Minh Pham - 991517388*/

package com.example.minh_trivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.minh_trivia.database.User
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity(), View.OnClickListener{

    private var currentPosition: Int = 0
    private var questionList: ArrayList<Question>? = null
    private var selectedOptionPosition: Int = 0
    private var userScore: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        questionList = Constants.getQuestions()

        val question: Question? = questionList!![currentPosition]

        setQuestion()

        radioOption1.setOnClickListener(this)
        radioOption2.setOnClickListener(this)
        radioOption3.setOnClickListener(this)
        radioOption4.setOnClickListener(this)

        btnSubmit.setOnClickListener(this)
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
            R.id.btnSubmit ->{
                /*Check if the user has selected any option or not*/
                if (R.id.radioOption1 == null && R.id.radioOption1 == null && R.id.radioOption1 == null && R.id.radioOption1 == null){
                    Toast.makeText(this, "Please select an option to continue", Toast.LENGTH_SHORT).show()
                } else{
                    val question = questionList?.get(currentPosition -1)
                    if (currentPosition <= questionList!!.size){
                        if (question!!.correctAnswer == selectedOptionPosition){
                            userScore += 1
                        }else{
                            userScore += 0
                        }
                        currentPosition += 1
                        setQuestion()
                    } else {
                        Toast.makeText(this, "You have completed the Quiz", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    private fun setQuestion(){
        val question: Question? = questionList!![currentPosition]

        tvQuestion.text = question!!.question
        radioOption1.text = question!!.optionOne
        radioOption2.text = question!!.optionTwo
        radioOption3.text = question!!.optionThree
        radioOption4.text = question!!.optionFour
    }

    private fun radioButtonSelected(selectedOptionNumber: Int){
        selectedOptionPosition = selectedOptionNumber
    }
}