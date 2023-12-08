package com.basic

import scala.util.control.Breaks._


// Importing  package

object BreakStatement{
  def main(args: Array[String]) {
//    breakable {                                 // Breakable method to avoid exception
//      for(i<-1 to 10 by 2){
//        if(i==7)
//          break                           // Break used here
//        else
//          println(i)
//


    for(i <- 1 to 3){
      breakable {
        for(j <- 1 to 3){
          if(i == 2 & j == 2 )
            break
          println(i+" "+j)


        }
        }
  }
  }
}