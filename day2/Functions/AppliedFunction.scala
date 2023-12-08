package com.day2.Functions

import java.util.Date

//passing argument in- as wildcard object
object PartiallyAppliedFunction {

  def log(date: Date, message: String) = {
    println(date + " " + message)

  }

  def main(args: Array[String]): Unit = {

    val sum = (a: Int, b: Int, c: Int) => a + b + c //fullyApplied Function

    val partFun = sum(10, 20, _: Int)
    println(sum(67, 70, 30));     //fullyApplied Function
    println(partFun(100))         //patiallyapplied fuction

    val date = new Date()
    val newLog = log(date, _: String) //partial //wildcard method
    println(newLog("message1"))
  }

}
