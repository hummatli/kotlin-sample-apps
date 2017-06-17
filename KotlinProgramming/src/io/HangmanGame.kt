package io

/**
 * Created by settar on 6/17/17.
 */

fun main(args: Array<String>) {
    print("Enter the word to guess: ")
    var word = readLine()

    //Getting guess word from first user
    if (word == null) {
        println("No word given, game ended.")
        return
    }

    //Print empty lines to set unreachable guessing word to the second user
    for (i in 1..100) {
        println()
    }

    //Converts word to lowerCase
    word = word.toLowerCase()

    val letters = word.toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0


    while (letters != correctGuesses) {
        print("Guess the letter: ")

        //Gets letter from second user
        val letter = readLine()?.get(0)?.toLowerCase()
        if (letter == null) {
            println("No letter given, game ended.")
            return
        }

        //Adds letter to correctGuesses if word contains
        var added = false
        for (i in 0..word.length - 1) {
            if (word.contains(letter)) {
                correctGuesses.add(letter)
                added = true
                break
            }
        }

        //Incriments fail if letter does not added
        if (!added) fails++

        //Prints explored word
        printExploredWordMy(word, correctGuesses)

        //Printes guest count
        println("#Wrong guesses: $fails\n\n")

    }

    //printExploredWord("Kotlin", mutableSetOf('o', 'l', 'k'))
    println("Well done!")

}


fun printExploredWordMy(word: String, correctGuess: Set<Char>) {
    val exploredWord = StringBuilder()
    for (i in 0..word.length - 1) {
        if (correctGuess.contains(word[i])) {
            exploredWord.append(word[i])
        } else {
            exploredWord.append('_')
        }
    }
    println(exploredWord)
}