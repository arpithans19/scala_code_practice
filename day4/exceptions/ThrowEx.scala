package com.day4.exceptions

object ThrowEx {

  def validate(m: Int, n: Int) = {
    val r = m * n

    if (r < 20) {
      throw new ArithmeticException("Calling outside try block")
    }
    else println("Calling outside try block-else statement")
  }

  def throwExFunc(mm: Int, nn: Int) = {
    val i = mm - nn


    if (i < 0) {
      throw new Exception
    }
    else println("Second function exceuted")

  }

  def main(args: Array[String]) {
    validate(22, 2)

    try {
      throwExFunc(2, 8)

    }
    catch {
      case ex: Exception => println("Calling inside try block")

    }

  }
}

