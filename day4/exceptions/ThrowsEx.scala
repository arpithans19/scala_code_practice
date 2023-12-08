package com.day4.exceptions


class ThrowsEx {
  @throws(classOf[NumberFormatException])
  def validate()={
    "abc".toInt
  }
  def validates()={
   123.toString
  }

}

object ThrowsObj{
  def main(args:Array[String]){

    val e = new ThrowsEx()


    try{
      e.validate()
      e.validates()
    }catch{
      case ex : NumberFormatException => println("Exception handeled here")

    }
    }



}
