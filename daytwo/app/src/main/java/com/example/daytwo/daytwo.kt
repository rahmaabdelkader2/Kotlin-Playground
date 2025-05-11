package com.example.daytwo

abstract class Shape {
    protected var dim:Double=0.0

    // primary constructor
    constructor()

    // secondary constructor
    constructor(dim:Double){
        this.dim=dim
    }


    abstract fun calcArea():Double
}

class Rectangle :Shape {


    private var height: Double = 0.0

    constructor()

    constructor(height: Double) {
        this.height = height
    }

    constructor(height: Double, dim: Double) : super(dim) {
        this.height = height
    }


    override fun calcArea(): Double {
        return height * dim
    }

}

class Circle : Shape{


    constructor()

    constructor(dim: Double): super(dim){
        this.dim
    }


    override fun calcArea():Double {
        return  3.14* dim*dim
    }
}

class Triangle : Shape{

    private var height: Double=0.0
    constructor()

    constructor(height: Double){
        this.height=height
    }
    constructor(height: Double,dim: Double):super(dim){
        this.height=height
    }

    override fun calcArea():Double{
        return 0.5*height*dim

    }

}

class Picture {
    fun sumAreas(Rectangle: Shape, Circle: Shape, Triangle: Shape): Double {
        return Triangle.calcArea() + Circle.calcArea() + Triangle.calcArea()
    }
}


fun main() {
    val picture = Picture()

    var rectangle = Rectangle(5.0, 10.0) //  height=10,dim=5
    var circle = Circle(7.0)            // radius=7
    var triangle = Triangle(8.0, 6.0)   //  height=6,dim=8

    var totalArea = picture.sumAreas(rectangle, circle, triangle)
    println("Total area: $totalArea")
}