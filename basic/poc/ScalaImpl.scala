package com.basic.poc


  import java.io.File

  import scala.collection.mutable.ListBuffer

class ScalaImpl  extends SensorTrait {

    var fileList: List[File] = null
    var mean=""
    var humidityListBuffer = new ListBuffer[List[String]]()
    var sensoridListBuffer = new ListBuffer[List[String]]()
    var map: Map[String, ListBuffer[Int]] = Map()

    def numOfProcessedFiles(dir: String): Int={
      val d = new File(dir)
      if (d.exists && d.isDirectory) {
        fileList = d.listFiles.filter(_.isFile).toList
      } else {
        List[File]()
      }

      return fileList.size
    }

    def numOfFailedMeasurements():Int={
      val HumidityListwithNaNData : List[String]=humidityListBuffer.toList.flatten
      var count=0
      for (i<- 0 to (humidityListBuffer.toList.flatten.length-1))
      {
        if(HumidityListwithNaNData(i).equals("NaN") )
        {
          count=count+1
        }
      }
      return count
    }

    def minAvgMaxHumidity(): Unit={
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
          avg=(sum/remainder.size)
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

    def sortsSensorsByHighestAvgHumidity():Unit={
      var sortMap: Map[String, Int] = Map()
      val finalSenserIDList: List[String]=sensoridListBuffer.toList.flatten
      for(i<- map) {
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
        mean =if(i._2.filterNot(p=> p.equals(0)).isEmpty) "NaN" else if(avg!=0) avg.toString else "NaN"
        val mean1 =if(i._2==List(0)) "NaN" else mean
        if(mean1!="NaN")
        {
          sortMap+=(i._1->mean1.toInt)
        }
        else
        {
          sortMap+=(i._1->0)
        }
      }
      import scala.collection.immutable.ListMap
      print("sorts sensors by highest avg humidity :")
      for(i<-ListMap(sortMap.toSeq.sortWith(_._2 > _._2):_*))
      {
        if(i._2==0)
          print(i._1-> "NAN"+", ");
        else
          print(i._1->i._2+", ");
      }
    }

  override def numOfProcessedMeasurements(): Int = ???
}
