package com.day2.Inheritance

class Employee{
  var salary:Float = 10000
}

class Programmer extends Employee{
  var bonus:Int = 5000
  println("Salary = "+salary)
  println("Bonus = "+bonus)
}

object SingleObject{
  def main(args:Array[String]){
    new Programmer()
  }
}
