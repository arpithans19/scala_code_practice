package com.day2.objectandclass

class Anonymous {

  def add(a: Int, b: Int) {
    val add = a + b;
    println("sum = " + add);
  }
}

object AnonymousObj {
  def main(args: Array[String]) {
    new Anonymous().add(10, 10);      //no reference name---Anonymous Object

  }


}
