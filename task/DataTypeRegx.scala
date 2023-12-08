package com.task

import com.day4.exceptions.MyCustomException

class DataTypeRegx {

  val int_Pattern: String = "^[0-9]*$"

  val string_Pattern: String = "^[a-zA-Z]+\\s+[0-9]*$"


  def findDataType(value: String) = {
    if (value.matches(int_Pattern)) {
      println("Integer ")
    }
    else if (value.matches(string_Pattern)) {
      println("String identified")
    }

    else {
      throw new MyCustomException("Invalid Input-Exception Occurs")
    }
  }


}


object DataTypeRegx {
  def main(args: Array[String]): Unit = {
    val e = new DataTypeRegx
    val input = scala.io.StdIn.readLine("Enter Input")

    try {
      e.findDataType(input)
    } catch {
      case ex: MyCustomException => println( ex)

    }
  }


}
