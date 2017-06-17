package io

/**
 * Created by settar on 6/17/17.
 */

fun main(args: Array<String>) {
    print("Enter the word to guess: ")
    val word = readLine()

    //Getting guess word from first user
    if (word == null) {
        println("No word given, game ended.")
        return
    }

    //Print empty lines to set unreachable guessing word to the second user
    for (i in 1..100) {
        println()
    }


    val letters = word.toLowerCase().toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0


    while (letters != correctGuesses) {

        printExploredWord(word, correctGuesses)
        println("#Wrong guesses: $fails\n\n")
        print("Guess the letter: ")

        val input = readLine()

        if (input == null) {
            println("Letter is empty. Please enter letter")
            continue
        }else if(input.length != 1){
            println("Please enter one letter")
            continue
        }


        if (word.toLowerCase().contains(input)){
            correctGuesses.add(input[0].toLowerCase())
        }else {
            fails++
        }

    }

    //printExploredWord("Kotlin", mutableSetOf('o', 'l', 'k'))
    printExploredWord(word, correctGuesses)
    println("#Wrong guesses: $fails\n\n")
    println("Well done!")

}


fun printExploredWord(word: String, correctGuess: Set<Char>) {
    for (char in word.toLowerCase()){
        if (correctGuess.contains(char)){
            print(char + " ")
        }else {
            print("_ ")
        }
    }
    println()
}