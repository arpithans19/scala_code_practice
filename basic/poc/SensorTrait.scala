package com.basic.poc

trait SensorTrait {
  def numOfProcessedFiles(dir: String): Int

  def numOfProcessedMeasurements(): Int

  def numOfFailedMeasurements():Int

  def minAvgMaxHumidity(): Unit

  def sortsSensorsByHighestAvgHumidity():Unit
}
