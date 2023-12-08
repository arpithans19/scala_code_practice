package com.day2.accessmodifiers
//within class, subclass, companion class

class ProtectedEx {
  protected var a: Int = 10
}

class SubClass extends AccessExample {
  def display() {
    println("a = " + a)
  }
}

object ProtectedExObj {
  def main(args: Array[String]) {
    val s = new SubClass()
    s.display()
  }
}
