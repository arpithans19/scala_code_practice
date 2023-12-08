package com.day2.Functions

object HigherOrder {

  def functionExample(a: Int, f: Int => AnyVal): Unit = {
    println(f(a)) // Calling that function
  }

  def multiplyBy2(a: Int): Int = {
    a * 2
  }
  def add2(a:Int):Int = {
    a+2
  }
  def add(a:Int)(b:Int) = {       //Fuction currying-multiple arguments
    a+b
  }

  def main(args: Array[String]) = {
    functionExample(25, multiplyBy2)      //Higher Order- Passing a function as parameter
    val result = multiplyBy2(add2(10)) // Function composition
    println(result)

    // Anonymous function is a function that has no name but works as a function
    val result1 = (a: Int, b: Int) => a + b // Anonymous function by using => (rocket)
    val result2 = (_: Int) + (_: Int) // Anonymous function by using _ (underscore) wild card
    println(result1(10,10))
    println(result2(10,10))

    var result3 = add(10)(10)       //function currying ,multiple arguments
    println("10 + 10 = "+result)
    var addIt = add(10)_
    var result6 = addIt(3)
    println("10 + 3 = "+result2)
  }

}

