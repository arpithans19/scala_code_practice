package com.basic

object IfStatement2 {
  def main(args: Array[String]) {

    val x=20;
    var res="";
    val y=30

    //&& evaluate both conditiona and return value
//    if(x==20 && y==30){

    // || need to satisfy atleast one conditiuon
    if(x==20 || y==90){
      println("x=20");

    }else
      {
        res="x=!20";

      }
      println(res);
    val res2= if(x!=20) "x==20" else "x!=20";
    println(res2)
  }

}
