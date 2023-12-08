package com.day4.regex

object RegexEx {


  def main(args: Array[String]) {

    // Applying r() method
    val portal = "GeeksforGeeks".r
    val CS = "GeeksforGeeks is a CS portal."

    // Displays the first match
    println(portal findFirstIn CS)
  }


}
