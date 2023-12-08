package com.task


import scala.collection.mutable.{ListBuffer, Set}
import scala.io.Source

case class ReadingFile(id:Int,company:String,place:String) {


  val fileSource = Source.fromFile("C:\\Users\\ARPITHAN\\Desktop\\test2.txt")
  val fileSource1 = Source.fromFile("C:\\Users\\ARPITHAN\\Desktop\\test.txt")
  val fileSource2 = Source.fromFile("C:\\Users\\ARPITHAN\\Desktop\\test3.txt")

//  val printWriter = new PrintWriter("test2.txt")


  def readFile(): Unit = {

    for (line <- Source.fromFile("C:\\Users\\ARPITHAN\\Desktop\\test2.txt").getLines) {
      println(line)

    }

    //List
    val myList = fileSource.getLines().toList
    println(myList)

    //list operation
    println("Adding:" + myList.appended("102 Infosys Mysore"))
    println(myList)
    val listBuffer = new ListBuffer[String]()
    listBuffer += "103 TCS Mangalore"
    listBuffer += "105 TCS chennai"
    println("listBuffer: " + listBuffer)

    println("Head: " + myList.head)
    println("Tail: " + myList.tail)
    val myList1 = fileSource1.getLines().toList
    println(myList1)
    val myList2 = fileSource2.getLines().toList
    println(myList2)


    //Map
    var myMap = myList.zipWithIndex.map { case (v, i) => (i, v) }.toMap
    println(myMap)

    myMap.foreach {
      case (key, value) => println(key + " -> " + value)
    }
    myMap += (6 -> "arp",7->"rav")
    println(myMap)
    println("removing elemnt: "+(myMap - 6))
    println("Accessing value by  key   " + myMap(1))

    val myMap2 = (myList2 zip myList1).toMap
    println(myMap2)
    myMap2.foreach {
      case (key, value) => println(key + " -> " + value)
    }

  }


}

object ReadingFileobj {
  def main(args: Array[String]): Unit = {
    val id:Int=0
    val company:String=null
    val place:String=null
    ReadingFile(id,company,place).readFile()
  }

}