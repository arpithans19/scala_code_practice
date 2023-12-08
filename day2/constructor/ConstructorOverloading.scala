package com.day2.constructor


class Student(id: Int, name: String) {
  var age: Int = 0

  def showDetails() {
    println(id + " " + name + " " + age)
  }

  def this(id: Int, name: String, age: Int) {
    this(id, name)      // Calling primary constructor, and it is first line
    this.age = age
  }
}

object MainObject {
  def main(args: Array[String]) {
    val s = new Student(101, "Rama", 20);
    s.showDetails()
  }


}
