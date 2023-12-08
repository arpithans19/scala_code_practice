package com.day4.exceptions

import java.io.{FileNotFoundException, FileReader, IOException}

object TryCatch {

  def getCharPosition(a: String, b: Int): Char = {
    val pos = a.charAt(b)
    pos
  }

  def main(args: Array[String]) {


    try {
      val a = "scala"
      val b = 1

      if (b > 2) {
        val pos = getCharPosition(a, b)
        println(pos)
      }
      else {
        throw new IllegalArgumentException
      }

    }
    catch {
      case i: StringIndexOutOfBoundsException => println("SIOB exception")
      case j: ArrayIndexOutOfBoundsException => println("AIob ")
      case j: IllegalArgumentException => println("+ve numb should be pass ")
      case a: IOException => println("its IoExceptions")
      case b: ArithmeticException => println("its ArithmeticExceptions")
      case th:Throwable=>println("Throwable -super ")
    }
    try {

      var n = 5 / 0
      val t = new FileReader("Scala.txt")


    }
    catch {
      // Catch block contain cases.
      case a: IOException => println("its IoExceptions")
      case b: ArithmeticException => println("its ArithmeticExceptions")
      case x: FileNotFoundException => println("No such files")
      case y: StringIndexOutOfBoundsException => println("SIOB exception")

    }
    finally {
      // Finally block will execute
      println("This is final block.-gurantee execution")
    }

    println("a")
  }


}
