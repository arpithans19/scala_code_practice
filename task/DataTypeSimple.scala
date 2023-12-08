package com.task

object DataTypeSimple {
  def main(args: Array[String]): Unit = {
    var m: Int = 0
    var str: String = null

    print("enter input ")
    try {

      m = scala.io.StdIn.readInt()
      println("its inetegr")

    }
    catch {
      case a: NumberFormatException => println(" Exception occures")

    }
    print("enter input ")
    try {

      str = scala.io.StdIn.readLine()
      println("its string")

    }
    catch {
      case a: NumberFormatException => println("its Exception")

    }

  }

}
