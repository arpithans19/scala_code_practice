package com.basic

object TernaryIf {
  def main(args: Array[String]) {
    val result = checkIt(10)
    println (result)
  }
  def checkIt (a:Int)  =  if (a >= 0) 1 else -1

}
