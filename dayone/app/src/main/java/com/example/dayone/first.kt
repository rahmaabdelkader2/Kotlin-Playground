package com.example.dayone


fun main(){

    var name= readLine()
    // isNullOrBlank()  handles null values (returns true if name is null or blank).
    //isBlank() would throw a NullPointerException if name is null.
    if (name.isNullOrBlank())
        name="anonymous"

    println("hello, $name")



}
