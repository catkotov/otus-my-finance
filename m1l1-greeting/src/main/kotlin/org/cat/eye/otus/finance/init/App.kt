package org.cat.eye.otus.finance.init

/**
 * Enter your name as a first element of arguments.
 */
fun main(args : Array<String>) {

    val name = if (args.isNotEmpty()) args[0] else "student"

    println(MessageUtils.getMessage(name))
    println("Program arguments: ${args.joinToString()}")
}
