package com.day2.objectandclass

class ClassEx {

  var id: Int = 0 // All fields must be initialized
  var name: String = null
}

object StudentObj {
  def main(args: Array[String]) {
    val s = new ClassEx() // Creating an object
    println(s.id + " " + s.name)
  }

}
