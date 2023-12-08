package com.day2.objectandclass

case class CaseClassEx(a: Int, b: Int){

}

object MainObject {
  def main(args: Array[String]) {
    val c = CaseClassEx(10, 10)       // Creating object of case class
    println("a = " + c.a)             // Accessing elements of case class
    println("b = " + c.b)
  }
}