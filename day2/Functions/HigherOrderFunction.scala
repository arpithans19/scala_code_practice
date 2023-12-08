package com.day2.Functions

object HigherOrderFunction {

  //Higher Order Function
  def math(x: Double, y: Double, z: Double, f: (Double, Double) => Double): Double = f(f(x, y), z)

  object Math {
    def +(x: Int = 45, y: Int = 15): Int = {
      x + y
    }

    def **(x: Int) = x * x;
  }


  def print(x: Int, y: Int): Unit = {
    println(x + y)

  }

  def main(args: Array[String]): Unit = {

    //higher order
    val res = math(50, 20, 10, (x, y) => x * y) //multiplication
    val res2 = math(50, 20, 10, _ max _) //_+_ wildcard method to add
    val res1 = math(50, 20, 10, (x, y) => x min y) //minimum of these two
    println(res2)
    println(res)
    println(res1)


    //using anonymous function, c is variable
    val c = (x: Int, y: Int) => x + y
    println(c(30, 30))

  //calling math function
    print(100, 200)
    println(Math ** 3) //when function has only 1 argument
    println(Math.+(60))
  }

}
