package com.day3.Collections
// access elements by - indexes.
// maintains insertion order


import scala.collection.mutable.Seq


object SequenceEx {
  def main(args: Array[String]) {


    val seq: Seq[Int] = Seq(52, 85, 1, 8, 3, 2, 7,2)

    seq.foreach((element: Int) => println(element + " "))

    println("Accessing element by index :-  " + seq(0))
    println("last index of 3 : " + seq.lastIndexOf(3))
    println("Index/last Index of  52: " + seq.lastIndexOf(52))
    println("reversing sequence:- " + seq.reverse)
    println("is Empty: " + seq.isEmpty)
    println("contains 8: " + seq.contains(8))
    println("Ends with (2,7): " + seq.endsWith(Seq(2, 0)))
    println("Add: " + seq.appended(10))
    println("Maximum: " + seq.max)


  }


}








//seq+="19"
//println(seq)