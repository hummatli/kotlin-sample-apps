package oo

/**
 * Created by settar on 6/16/17.
 */

class Stack<E>(vararg val items: E) {

    val elements = items.toMutableList()

    fun push(element: E) {
        elements.add(element)
    }

    //Burda nullable type var bu duzgun designe deyil sonra buna el gezdirmelyik
    fun pop(): E? {
        if (!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }

    fun isEmpty(): Boolean = elements.isEmpty()
}

fun <T> stackOf(vararg elements: T): Stack<T> {
    return Stack(*elements)
}

fun main(args: Array<String>) {
    val stack = Stack(1, 3, 4, 5, 6) //Burda avtomatik ginerics type parametrin hansi olduqunu goturur

    val stack2 = stackOf("Hi", "Hello", "Bye")

    for (i in 1..3){
        println(stack2.pop())
    }


    stack.push(34)

    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
}