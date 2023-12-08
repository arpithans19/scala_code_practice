package com.day4.exceptions


class MyCustomException(s: String) extends Exception(s) {}

  class MyCustomExceptionExample {
    @throws(classOf[MyCustomException])
    def validate(age: Int) {
      if (age < 0) {
        throw new MyCustomException("Age must be positive")
      }
    }
  }

  object MyObject {
    def main(args: Array[String]) {
      val me = new MyCustomExceptionExample()
      try {
        me.validate(-1)
      } catch {
        case e: Exception => println("Exception occurred : " + e)
      }
    }

}
