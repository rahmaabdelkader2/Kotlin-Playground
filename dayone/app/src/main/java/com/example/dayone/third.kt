package com.example.dayone


fun main(){
    println("choose from these options : ADD , SUB , MUL , DIV")
    var option =readLine()
    println("enter first number")
    var x  = readLine()?.toDoubleOrNull()
    println("enter second number")
    var y = readLine()?.toDoubleOrNull()

    if(x==null || y==null){
        println("invalid inputs")
        return
    }


    val result=when (option) {
        "ADD" -> x+y
        "SUB" -> x-y
        "MUL" -> x*y
        "DIV" -> if(y==0.0) "division by zero is not allowed"
                 else x/y


        else -> print("No other options are found")
    }
    println("result = $result")


}