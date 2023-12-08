package com.task

import java.io.{FileReader, PrintWriter}
import scala.io.Source

case class ReadfileEx() {

  val fileObject = new FileReader("test.txt")




  val fileSource = Source.fromFile("test.txt").getLines.filter(f => !f.trim.isEmpty)
  val myMap = io.Source
    .fromFile("test.txt") // open the file
    .mkString // turn it into one long String
    .split("(?=\\n\\S+\\s*->)") // a non-consuming split
    .map(_.trim.split("\\s*->\\s*")) // split each element at "->"
    .map(arr => arr(0) -> arr(3)) // from 2-element Array to tuple
    .toMap

  //reading each character
  while (fileSource.hasNext) {
    println(fileSource.next)
  }

  //reading each line
  //  for(line<-fileSource.toString()){
  //    println(line).toMap
  //  }

}

object ReadfileExObj {
  def main(args: Array[String]): Unit = {
    ReadfileEx()
    //    FileClass(stName, stAge, stId).fileName()
  }
}
