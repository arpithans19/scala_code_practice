package com.task

object FiboSeries {
//1 1 2 3
  def fibonacci(n: Int): Int = {

    if (n < 1) {
    1
  }
    else {
    fibonacci (n - 1) + fibonacci (n - 2)
  }
  }


  def main(args: Array[String]): Unit = {

    var result = for (n <- 1 to 10) yield n
    for (i <- result) {
      println(fibonacci(i))
    }
  }

}
