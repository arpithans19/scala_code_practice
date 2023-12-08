package com.day2.accessmodifiers
//within class
class PrivateExample{
  private var a:Int = 10
  def show(){
    println(a)
  }
}
object PrivateObject{
  def main(args:Array[String]){
    var p = new AccessExample()
    p.a = 12
    p.show()
  }
}
