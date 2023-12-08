package com.day3.tuples

//stores mixed type of data
object Tuples {

  def main(args: Array[String]) {
    val tuple = (1, 5, 8, 6, 4)
    val tuple2 = ("Unix", "Scala", "Java")
    val tuple3= (2.5, 8.4, 10.50)
    println("Tuple -Integer:" + tuple)
    println("Tuple -String:" + tuple2)
    println("Tuple -Float:" + tuple3)

    val tuple4 = (1, 2.5, "India",89)
    println("class:  " + tuple4.getClass)
    println("iterating values of tuple 4: using product iterator")
    tuple4.productIterator.foreach(println)
//       tuple.foreach((element: Int) => println(element))
    val mm = Tuple2("q", 1)
    println("Swapping: " + mm.swap)

    println("Accessing values: ")
    println("First value of Tuple-4: " + tuple4._1)
    println("Second value of Tuple-4: " + tuple4._2)
    println("Concatenated String: " + tuple4.toString())
    println("converting to Hashcode: " + tuple4.hashCode())



  }


}
