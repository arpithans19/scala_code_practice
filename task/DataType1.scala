package com.task


object CheckDataTypeExample {

  def fun(data: Any) = data match {
    case _: Int => "Int"
    case _: String => "String"
    case _ => throw new Exception

  }

  def main(args: Array[String]) {

    try {

      val y = "ioksjjsh"
      val z = 192

      println(fun(y))
      println(fun(z))
    }
    catch {
      case i: Exception => println("Exception occurs")
    }

  }

}
