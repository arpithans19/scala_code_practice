package com.basic

object ForLoop {

  def main(args: Array[String]) {
    //    last value exclude
    for (a <- 1.until(10)) {
      println(a)
    }
    var result = for (a <- 1 to 10) yield a
    for (i <- result) {
      println(i)
    }

    //by -skip iteration
    println("by")
    for (i <- 1 to 10 by 2) {
      println(i)

    }
    var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9) // Creating a list
    for (i <- list) { // Iterating the list
      println(i)
    }

    for (a <- 1 to 10) {
      println(a);
    }
    for (a <- 1 to 10 if a % 2 == 0) {
      println(a)
    }

  }
}
