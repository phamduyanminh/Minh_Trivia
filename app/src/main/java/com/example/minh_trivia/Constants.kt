package com.example.minh_trivia

import com.example.minh_trivia.Question

object Constants {
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val question1 = Question(
            1,
            "Which country won the World Cup in 2010?",
            "Argentina",
            "Netherlands",
            "Spain",
            "Germany",
            4
        )
        questionsList.add(question1)

        val question2 = Question(
            2,
            "Who was the GK that won Ballon d'Or?",
            "M.Neuer",
            "Van Der Sar",
            "Oliver Kahn",
            "Lee Yashin",
            4
        )
        questionsList.add(question2)

        val question3 = Question(
            3,
            "Who was the GK that won Ballon d'Or?",
            "M.Neuer",
            "Van Der Sar",
            "Oliver Kahn",
            "Lee Yashin",
            4
        )
        questionsList.add(question3)

        val question4 = Question(
            4,
            "Which country won the first World Cup?",
            "Brazil",
            "Portugal",
            "Uruguay",
            "Italy",
            3
        )
        questionsList.add(question4)

        val question5 = Question(
            5,
            "Which country won the most World Cup?",
            "Brazil",
            "Germany",
            "France",
            "Australia",
            1
        )
        questionsList.add(question5)

        val question6 = Question(
            6,
            "Which country won World Cup 4 times?",
            "Japan",
            "Hungary",
            "Germany",
            "Serbia",
            3
        )
        questionsList.add(question6)

        val question7 = Question(
            7,
            "Which African country has hosted the World Cup?",
            "Nigeria",
            "South Africa",
            "Rwanda",
            "Morroco",
            3
        )
        questionsList.add(question7)

        val question8 = Question(
            8,
            "What year USA, Canada and Mexico will host the World Cup?",
            "2022",
            "2024",
            "2026",
            "2028",
            3
        )
        questionsList.add(question8)

        val question9 = Question(
            9,
            "Which Asian country won the World Cup?",
            "Japan",
            "None",
            "UAE",
            "Iran",
            2
        )
        questionsList.add(question9)

        val question10 = Question(
            10,
            "Which first European country won the first World Cup?",
            "Hungary",
            "Italy",
            "Soviet Union",
            "Yugoslavia",
            2
        )
        questionsList.add(question10)

        return questionsList
    }
}