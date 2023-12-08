package com.task

import java.io.File
import scala.collection.mutable.ListBuffer

case class SensorClass() {

}

object SensorObject {
  val dir = "C:\\Users\\ARPITHAN\\Desktop\\ScalaFiles"
  val leader1 = io.Source.fromFile("C:\\Users\\ARPITHAN\\Desktop\\ScalaFiles\\leader-1.csv")
  val leader2 = io.Source.fromFile("C:\\Users\\ARPITHAN\\Desktop\\ScalaFiles\\leader-2.csv")


  def main(args: Array[String]): Unit = {

    //number of files
    val files = new java.io.File(dir).listFiles.filter(_.isFile).filter(_.getName.endsWith(".csv"))
    //      .foreach(x=>println(x))

    println("Number of Files: " + files.size)
    val f1 = leader1.getLines.map(_.split(", *")(1))
    val f2 = leader2.getLines.map(_.split(", *")(1))
    val out = new java.io.FileWriter("output.csv")
    f1 zip f2 foreach { x => out.write(x._1 + ", " + x._2 + "\n") }
    out.close
    println(out)


    //measurements
    val c = leader1.getLines().size - 1
    val d = leader2.getLines().size - 1
    val measurements = c + d
    println("Measurements:" + measurements)

    //reading lines
    //    for (line2 <- io.Source.fromFile("C:\\Users\\ARPITHAN\\Desktop\\ScalaFiles\\leader-2.csv").getLines) {
    //      println(line2)
    //    }
    //    for (line1 <- io.Source.fromFile("C:\\Users\\ARPITHAN\\Desktop\\ScalaFiles\\leader-1.csv").getLines) {
    //      println(line1)
    //
    //    }

    //failed
    val nan1 = leader1.getLines().toString().split(",").map(_.filter(_.==("NaN"))).size
    val nan2 = leader2.getLines().toList.toString().split(",").map(_.filter(_.==("NaN"))).size
    val nan = nan1 + nan2
    println("Failed:" + nan)


    //mean,avg,median----
    val m = io.Source.fromFile("C:\\Users\\ARPITHAN\\Desktop\\ScalaFiles\\leader-1.csv").getLines
      .toList
    println(m)

    val nm = io.Source.fromFile("C:\\Users\\ARPITHAN\\Desktop\\ScalaFiles\\leader-2.csv").getLines.toList
    println(nm)

    val lm = (m ++ nm).flatten
    println(lm)

    println("sensor-id,min,avg,max,median")
    println(m(1), m(2), m(3))
    println(nm(1), nm(2), nm(3), nm(4))
    println(m(2) ++ nm(3))


    val myMap1 = m.zipWithIndex.map { case (v, i) => (i, v) }.toMap
    val myMap2 = nm.zipWithIndex.map { case (v, i) => (i, v) }.toMap
    val myMap3 = myMap1 ++ myMap2
    println(myMap1)


    //    val mo = leader1.getLines.map(_.split(","))
    //    println(mo)
    myMap3.foreach {
      case (key, value) => println(key + " -> " + value)
    }


    val map: Map[Char, ListBuffer[Int]] = Map()
    val src = scala.io.Source.fromFile("C:\\Users\\ARPITHAN\\Desktop\\ScalaFiles\\leader-1.csv")
    val res =
      src.getLines.toList.flatMap { line =>
        line.split(",").toList match {
          case key :: values => values.map(v => key -> v)
          case _ => Nil
        }
      }
    src.close()
    println(res)


    val keySet = myMap3.keySet
    for (i <- keySet) {
      println(i)
    }

    val u = leader1
      .getLines().toList
      .drop(1)
      .map(_.split(","))
      .groupBy(_ (1))
      .map { case (key, values) => (key, values.map(_ (1))) }

    println(u)


    val v = leader1.getLines().drop(1).foldLeft(Map.empty[String, List[String]]) {
      (acc, line) ⇒
        val value :: key :: Nil = line.split(",").toList
        acc + (key → (acc.getOrElse(key, List.empty) :+ value))


    }
    println(v)

    println(leader1.getLines()
      .drop(1).map(_.split(",").toList)
      .map(x => x.tail.head -> x.head).toList
      .groupBy(_._1)
      .map(x => x._1 -> x._2.map(v => v._2)))

  }

  var fileList: List[File] = null
  var mean=""
  var humidityListBuffer = new ListBuffer[List[String]]()
  var sensoridListBuffer = new ListBuffer[List[String]]()
  var map: Map[String, ListBuffer[Int]] = Map()
  val finalSenserIDList: List[String]=sensoridListBuffer.toList.flatten
  val finalHumidityList: List[Int]=humidityListBuffer.toList.flatten.map(e => if(e=="NaN") "0" else e).map(x=> x.toInt)
  var count1=0
  for (str <- finalSenserIDList) {
    if (map.contains(str)) {
      map += (str -> (map(str) += finalHumidityList(count1)))
    } else {
      map += (str -> ListBuffer(finalHumidityList(count1)))
    }
    count1=count1+1
  }
  println( "sensor-id"+"," + "min"+ ","  + "avg" + "," + "max :")
  for(i<- map)
  {
    val remainder=i._2.filterNot(p=> p.equals(0))
    val sum= i._2.filterNot(p=> p.equals(0)).sum
    var avg=0
    if(!remainder.isEmpty || !sum.equals(0))
    {
      avg= sum/remainder.size
    }else
    {
      avg= 0
    }
   val mean =if(i._2.filterNot(p=> p.equals(0)).isEmpty) "NaN" else if(avg!=0) avg.toString else "NaN"//(i._2.filterNot(p=> p.equals(0)).sum/(i._2.filterNot(p=> p.equals(0)).size))
    val min =if(i._2.filterNot(p=> p.equals(0)).isEmpty) "NaN" else i._2.filterNot(p=> p.equals(0)).min
    val max =if(i._2.filterNot(p=> p.equals(0)).isEmpty) "NaN" else i._2.filterNot(p=> p.equals(0)).max
    println(i._1 + "," +  min+ ","  + mean + "," + max)
  }


}
