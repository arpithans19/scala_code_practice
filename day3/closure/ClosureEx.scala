package com.day3.closure

object ClosureEx {
  val factor = 3
  val multiplier = (i: Int) => i * factor

  var num = 12
  var add = (x: Int) => {
   num= x + num
    num
  }

  def main(args: Array[String]): Unit = {
    num=8   //impure
    println(add(100))
    println(multiplier(12)) //pure closure
    println(num)

  }


}