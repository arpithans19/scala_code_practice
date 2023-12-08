package com.basic

object ForEach {
  def main(args: Array[String]) {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9) // Creating a list
    list.foreach{
      println     // Print each element
    }
    list.foreach(print)
    println
    list.foreach((element:Int)=>print(element+" "))      // Explicitly mentioning type of elements
  }
}
