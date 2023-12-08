package com.basic

object MainObject {
  def main(args: Array[String]) {
    functionExample() // Calling function
  }




  def functionExample() { // Defining a function
    var a:Int =12//mutable
    var b:Int =45//mutable
    a=20
    println(a.+(b));



    //shows error
//    var c:Int;

    //identify the datatype
    val d=true;
    println(d);




    //multiple expression
    val x={val s:Int=200;val n:Int=200;val nn:Int=200;s+n+nn};
    println(x);

    val z={val o:Int=300
      val oo:Int=300
      o*oo
    }
    println(z);

    println("This is a simple function")
  }
}
