package com.example.dayone

fun main() {
    println("enter your first name:")
    val firstName = readLine()?: ""

    println("enter your last name:")
    val lastName = readLine()?:""

    println("full name: $firstName $lastName")
}