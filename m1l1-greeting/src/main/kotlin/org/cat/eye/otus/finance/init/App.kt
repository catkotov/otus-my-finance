package org.cat.eye.otus.finance.init

fun main(args : Array<String>) {

    val name = if (args.isNotEmpty()) args[0] else "student"

    println(MessageUtils.getMessage(name))
    println("Program arguments: ${args.joinToString()}")
}
