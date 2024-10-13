package com.group20.memorygame.entity

class User (val name:String) {

    var gamesPlayed:Int = 0

    var highScore:Int = 0

    var score:Int = 0

    fun resetScore():Int{
        score = 0
        return score
    }

    fun resetAll(){
        gamesPlayed = 0
        highScore = 0
        resetScore()
    }

}