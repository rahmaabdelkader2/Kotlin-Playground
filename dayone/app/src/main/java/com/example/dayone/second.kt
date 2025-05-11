package com.example.dayone

import java.util.Random


fun main(){


    var random=Random()

    val arrayOfIntegers = IntArray(100) {
        // inclusive awl rkm we exclusive a5r rkm
        random.nextInt(100+1)
    }

    for (num in arrayOfIntegers) {
        if (num <= 10) println(num)
    }


}
