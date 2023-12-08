package com.day2.objectandclass

class scalaclass(private val name: String, var age: Int) {
  //methods
  def userMethod: Unit = { //auxilary constr
    println(name)
  }

}


object Demo {
  def main(args: Array[String]): Unit = {
    val user = new scalaclass("tom", 22)
    println(user.age)
    //    println(user.name)
    user.userMethod
  }


}

