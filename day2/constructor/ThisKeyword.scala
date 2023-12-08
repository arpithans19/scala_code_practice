package com.day2.constructor
//this is a keyword and used to refer current object
//this keyword is used to call constructor from other constructor.

class ThisKeyword(id: Int, name: String) {
  var age: Int = 0

  def showDetails() {
    println(id + " " + name + " " + age)
  }

  def this(id: Int, name: String, age: Int) {
    this(id, name)              // Calling primary constructor, and it is first line
    this.age = age
  }
}

object ThisObject {
  def main(args: Array[String]) {
    val s = new Student(101, "Rama", 20);
    s.showDetails()
  }


}
