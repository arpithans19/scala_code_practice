package com.basic

object HelloScala {
  def main(args: Array[String]) {
    val name = "xyz"
    val age = 18.0
    println(name + " is " + age + " yeras");

    println(s"$name is $age years");

    println(f"$name%s is $age%f years");

    //    println(f"$name%s is $age%d years");//f string interpolation

    println(s"hello \n world")

    println(raw"hello \n world")
  }
}
