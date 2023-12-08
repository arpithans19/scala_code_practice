package com.task

import java.io.{File, PrintWriter}
import scala.collection.mutable.{ListBuffer, Set}

case class FileClass(stName: ListBuffer[String], stAge: ListBuffer[Int], stId: Set[Int]) {
  def fileName(): Unit = {

    val file = new File("test.txt")
    val writer = new PrintWriter(file)

    stName += ("sss", "ram")
    stAge += (25, 33)
    stId += (112, 300)

    println(stId)

    for (i <- 0 until (stName.size)) {
      writer.write(" " + stName(i) + " " + stAge(i) + " " + stId(i) + "\n")
    }

    for (newAge <- stAge) {
      if (newAge >= 25) {
        println(newAge)

      }
      else
        println(f"please enter salary greater than 29999.0")
    }



    writer.close()


  }
}

object MainObj1 {
  def main(args: Array[String]): Unit = {


    val stName = ListBuffer("xxx", "yy", "zzz")
    val stAge = ListBuffer(20, 22, 34)
    val stId = Set(102, 208, 608)
    FileClass(stName, stAge, stId).fileName()
  }

}
