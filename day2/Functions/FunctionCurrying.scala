package com.day2.Functions

object FunctionCurrying {
  //normal
  def add(x: Int, y: Int) = x + y

  //currying
  def add2(x: Int) = (y: Int, z: Int) => x + y + z


  def main(args: Array[String]): Unit = {
    println(add(10, 20))

    println(add2(10)(20,10))


    //    val sum = add2(40)
    //    println(sum(10))
  }
}
