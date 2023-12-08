package com.day2.methodoverloading


class Arithmetic {
  def add(a: Int, b: Int) {
    var sum = a + b
    println(sum)
  }

  def add(a: Int, b: Int, c: Int) {
    var sum = a + b + c
    println(sum)
  }
  def diffDatType(a: Int, b: Int) {     //same args,different datatypes
    val sum = a + b
    println(sum)
  }
  def diffDatType(a: Double, b: Double) {
    val sum = a + b
    println(sum)
  }
}

object MainObject {
  def main(args: Array[String]) {
    val a = new Arithmetic()
    a.add(10, 10)
    a.add(10, 10, 10)
    a.diffDatType(10,10)
    a.diffDatType(10.0,10.0)
  }
}


