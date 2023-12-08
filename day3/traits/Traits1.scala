package com.day3.traits

//multiple traits -- 1st one with extends, remianing 'with'

trait trait1 {
  def print()
}

trait trait2 {
  def show()
}

trait trait3 {
  def run() //abstract method

  def sun(): Unit = {
    println("Traits using abstarct methods...")
  }

}

//when class doesn't implement traits method ,
abstract class A extends trait1 with trait2 {
  def printA4() {
    println("Abstract class extend traits")
  }

}

class normClass extends A with trait1 with trait2 with trait3 {

  def print() {
    println("1st Trait")
  }

  def show(): Unit = {
    println("2nd Trait")
  }

  def run(): Unit = {
    println("trait3 run()")
  }


}



object Traits_Object {
  def main(args: Array[String]) {
    val a = new normClass()

    a.print() //1st trait
    a.show() //2nd trait
    a.run() //abstract method
  }
}


