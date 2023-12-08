package com.day2.Functions

object FunctionEx {

  object Math {
    def add(x: Int, y: Int): Int = {
      x + y;
    }

    def square(x: Int) = x * x;
  }


  def add(x: Int, y: Int): Int = {
    x + y;
  }

  def subtract(x: Int, y: Int): Int = {
    x - y;
  }

  def multiply(x: Int, y: Int): Int = x * y;

  def divide(x: Int, y: Int) = x / y;

  def main(args: Array[String]): Unit = {
    println(Math square 3) //when function has only 1 argument
    println(Math.add(20, 30))
    println(add(45, 50));
    println(subtract(30, 20));
    println(multiply(30, 20));
    println(divide(30, 20))

  }

}
