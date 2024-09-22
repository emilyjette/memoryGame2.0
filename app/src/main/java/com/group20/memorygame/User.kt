package com.group20.memorygame

public class User (val name:String) {

    private var gamesPlayed:Int = 0
    private var highScore:Int = 0
    private var score:Int = 0

    fun getUsername():String{
        return name
    }

    fun increaseGamesPlayed(){
        gamesPlayed ++
    }
    fun getGamesPlayed():Int{
        return gamesPlayed
    }

    fun increaseScore(){
        score ++
    }
    fun resetScore():Int{
        score = 0
        return score
    }
    fun getScore():Int{
        return score;
    }

    fun getHighScore():Int{
        return highScore
    }
    fun setHighScore(currentScore:Int){
       highScore = currentScore
    }

    fun resetAll(){
        gamesPlayed = 0
        highScore = 0
    }
}