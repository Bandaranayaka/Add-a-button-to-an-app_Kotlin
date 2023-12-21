package com.example.addabuttontoanapp_kotlin

fun main(){
//    val diceRange = 1..6
//    val randomNumber = diceRange.random()
//    println("Random number : $randomNumber")
//
////----------------------------------------------------------------------------
//
//    val rand = -10..-2
//    val randNumber = rand.random()
//    print("Rndom number : $randNumber")

    val myFirstDice = Dice(6)
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}!")

    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSides} aides dice rolled ${mySecondDice.roll()}!")

}

class Dice(val numSides : Int){

    fun roll(): Int{
        val randomNumber = (1..numSides).random()
        return randomNumber
    }
}