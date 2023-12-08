package com.basic

object Calculator {
  def main(args: Array[String]) {
    var ch: Char = 0

    var num1: Int = 0
    var num2: Int = 0
    var result: Int = 0
    var status = 0

    do {
      print("Choose operation to perform (+,-,*,/,%): ")

      ch = scala.io.StdIn.readChar()
      if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {


        //      else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {

        print("Enter first number: ")
        num1 = scala.io.StdIn.readInt()

        print("Enter second number: ")
        num2 = scala.io.StdIn.readInt()


        ch match {
          case '+' => result = num1 + num2
          case '-' => result = num1 - num2
          case '*' => result = num1 * num2
          case '/' => result = num1 / num2
          case '%' => result = num1 % num2

        }


        println("Result: " + result)
      }
      else {
        println("invalid operation")
      }

      print("Press 1 to continue ")
      status = scala.io.StdIn.readInt()

    }

    while (status == 1);

  }


}
