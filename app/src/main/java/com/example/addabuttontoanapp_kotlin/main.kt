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

    val myFirstDice = Dice()
    println(myFirstDice.sides)
    myFirstDice.roll()

}

class Dice{
    var sides = 6

    fun roll(){
        val randomNumber = (1..6).random()
        println(randomNumber)
    }
}