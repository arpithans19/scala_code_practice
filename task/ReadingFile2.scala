package com.task

import java.io.{FileNotFoundException, FileReader}
import scala.io.Source

case class ReadingFile2(company: String, id: Int, place: String) {


}

object ReadingObject2 {
  def main(args: Array[String]): Unit = {


    try {
      val t = new FileReader("test2.txt")
    }

    catch {
      case i: FileNotFoundException => println(i)
    }
    val fileSource = Source.fromFile("C:\\Users\\ARPITHAN\\Desktop\\test2.txt")
    val myList = fileSource.getLines().toList
    val r = myList.toString().split(" ")
    (0 until r.length by 3).foreach(x => println(ReadingFile2(r(x), r(x + 1).toInt, r(x + 2))))

    val rr = new ReadingFile2("Capgemini", 101, "Bangalore")
    println(rr)


  }
}