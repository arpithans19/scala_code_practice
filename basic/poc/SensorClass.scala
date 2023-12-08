package com.basic.poc

case class SensorClass(sensorid: String, humidity: String)

object SensorStatistics {

  def main(args: Array[String]): Unit = {
    //var dir= args(0)
    var dir = "C:\\Users\\ARPITHAN\\Desktop\\ScalaFiles"
//    var n = new java.io.File(dir).listFiles.filter(_.getName.endsWith(".csv"))
//    println(n.size)
//    for (ls <- n) {
//      println(ls)
//    }
        val sensorSpark=new ScalaImpl()
        val noOfProcessedFile=sensorSpark.numOfProcessedFiles(dir)
      println("Num of processed files:" + noOfProcessedFile)
    //    val numOfProcessedMeasure=sensorSpark.numOfProcessedMeasurements()
    //    println("Num of processed measurements: "+numOfProcessedMeasure)
        val numOfFailedMeasure=sensorSpark.numOfFailedMeasurements()
        println("Num of failed measurements: "+numOfFailedMeasure)
        sensorSpark.minAvgMaxHumidity()
        sensorSpark.sortsSensorsByHighestAvgHumidity()
  }

}