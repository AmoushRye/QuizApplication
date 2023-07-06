package com.example.quizapp.utils

import com.example.quizapp.model.Question
import com.example.quizapp.R
object Constants {
    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val SCORE = "correct_answers"
    fun getQuestions():MutableList<Question>{
        val questions = mutableListOf<Question>()
        val quest1 = Question(
            1,"Which college is linked with the logo below?",
            R.drawable.manipal,"IIIT",
            "SMIT","NIT","IIT",
            2
        )
        questions.add(quest1)
        val quest2 = Question(
            2, "Which car company is this?",
            R.drawable.tesla,
            "Tesla", "Bugatti",
            "Maruti Suzuki", "none",
            1
        )
        questions.add(quest2)

        val quest3 = Question(
            3, "Name of Thor's Hammer?",
            R.drawable.thor,
            "Naive Hammer", "WarMachine",
            "God of Thunder", "Mjolnir",
            4
        )
        questions.add(quest3)

        val quest4 = Question(
            4, "What is the name of the character?",
            R.drawable.tom,
            "Thomas Shelby", "Tommy Shelby",
            "Both A and B", "None of the options",
            3
        )
        questions.add(quest4)

        val quest5 = Question(
            5, "Name the popular Netflix Series?",
            R.drawable.squi,
            "Squid Game", "Peaky Blinders",
            "Narcos", "Quiet place",
            1
        )
        questions.add(quest5)

        val quest6 = Question(
            6, "What is the name of the Series?",
            R.drawable.wednesday,
            "Serial Killer", "Wednesday",
            "Squid Game", "Altered Carbon",
            2
        )
        questions.add(quest6)

        val quest7 = Question(
            7, "What is the name of the actor?",
            R.drawable.iron,
            "Steve Rogers", "Chris Hemsworth",
            "Robert Downey", "Wakanda",
            3
        )
        questions.add(quest7)

        val quest8 = Question(
            8, "What is the name of the series he is in?",
            R.drawable.walter,
            "Breaking Bad", "Alone",
            "Narcos", "Wednesday",
            1
        )
        questions.add(quest8)

        val quest9 = Question(
            9, "How much did Avatar 2 made?",
            R.drawable.avt,
            "$2.887 Billion", "$2.315 Billion",
            "$4.457 Billion", "$1.915 Billion",
            2
        )
        questions.add(quest9)

        val quest10 = Question(
            10, "Who is this legendary FilmMaker?",
            R.drawable.cas,
            "James Cameron", "Tom Cruise",
            "Christopher Nolan", "None of the options",
            3
        )
        questions.add(quest10)
        return questions
    }
}