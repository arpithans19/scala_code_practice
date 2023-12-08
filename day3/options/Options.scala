package com.day3.options

object Options {
  def main(args: Array[String]): Unit = {

    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
    val map = Map((1, "aaa"), (2, "bbb"), (3, "cccc"))
    val list = List(1, 2, 4)
    val opt:Option[Int]=None

    println(list.find(x => x > 2))
    println(list.find(x => x > 2).get)
    println(list.find(_ > 100).getOrElse("No such Element"))
    println(map.get(10).getOrElse("Exception"))
    println(capitals.get("France"))
    println(capitals.get("India"))
    println(opt.isEmpty)

  }
  //using pattern matching

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "exception"
  }

  val capitals = Map("China" -> "Beijing", "USA" -> "DCW")
  println("\nusing pattern matching")
  println(show(capitals.get("China")))
  println(show(capitals.get("Australia")))





}
