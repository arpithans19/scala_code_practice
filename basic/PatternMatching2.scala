package com.basic

object PatternMatching2 {
  def main(args: Array[String]) {
    var result = search ("Hello")
    print(result)
  }
  // we are defining method having a match with cases for any type of data.
  // Any is a class in scala which is a super class of all data types and deals with all type of data.
  def search (a:Any):Any = a match{
    case 1  => println("One")
    case "Two" => println("Two")
    case "Hello" => println("Hello")
    case _ => println("No")

  }
}