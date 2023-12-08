package com.day2.constructor

class PrimaryConst(id: Int, name: String) {         // Primary constructor
  var age: Int = 0

  def show() {
    println(id + " " + name)
    println(id + " " + name + " " + age)
  }

  def this(id: Int, name: String, age: Int) {
    this(id, name)          // Calling primary constructor, and it is first line
    this.age = age
  }

}


object PrimaryConstObj {
  def main(args: Array[String]) {
    val prim = new PrimaryConst(100, "Martin") // Passing values to constructor
    var s = new PrimaryConst(101,"Rama",20);
    prim.show()          // Calling a function by using an object
    s.show()            //calling secpondary/auxilary constructor
  }
}  