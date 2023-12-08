package com.basic

object PatternMatching {
  def main(args: Array[String]) {

    val a = 0
    val bbb = "a";

    a match {
      case 1 => println("One")
      case 2 => println("Two")
      case _ => println("Default")
    }
    bbb match {
      case "a" => println("One")
      case "c" =>println("one")
      case "b" => println("Two")
      case _ => println("Default")
    }

    //for multiple cases
    val i = 7
    i match {
      case 1 | 3 | 5 | 7 | 9 => println("odd");
      case 2 | 4 | 6 | 8 | 10 => println("even")
    }
  }


}
