package com.day3

object Practice {
  def main(args: Array[String]): Unit = {

    var lowerRange: Int = 0
    var upperRange: Int = 0
    var m: Int = 0
    var x: Int = 0

    print("enter starting num  ")
    lowerRange = scala.io.StdIn.readInt()

    print("enter last num  ")
    upperRange = scala.io.StdIn.readInt()

    val lRange = List.range(lowerRange, upperRange)
    println(lRange)

    println("enter num to divide")
    m = scala.io.StdIn.readInt()
    if (m > upperRange || m==0) {
     println("m shouldn't be zero and lesser than upperRange")
    }
    else {
      val res = lRange.filter(_ % m == 0)
      println(res)
    }



    //    for (i <- lRange if i % m == 0) {
    //
    //      print("  " + i)
    //    }


  }

}
