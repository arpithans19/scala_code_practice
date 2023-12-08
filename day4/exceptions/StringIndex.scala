package com.day4.exceptions

import java.io.IOException

object StringIndex {

  def getCharPosition(a: String, b: Int): Char = {
    val pos = a.charAt(b)
    pos
  }

  def main(args: Array[String]): Unit = {

    try {
      val a = "scala"
      val b = 10
      val pos = getCharPosition(a, b)
      println(pos)

    }
    catch {
      case i: StringIndexOutOfBoundsException => println("SIOB exception")
      case j: ArrayIndexOutOfBoundsException => println("AIob ")
      case a: IOException => println("its IoExceptions")
      case b: ArithmeticException => println("its ArithmeticExceptions")
    }


  }
}
