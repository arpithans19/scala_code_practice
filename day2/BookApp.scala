package com.day2

import java.util.Date

case object BookApp extends App{
    var ch: Char = 0
    var from: String = null
    var to: String = null
    val todayDate = new Date()


    println("What You want to book- " +
      "\n Enter B for bus " +
      "\n Enter F for Flight" +
      "\n Enter T for Train\n"
    )
    ch = scala.io.StdIn.readChar()
    if (ch == 'b' || ch == 't' || ch == 'f' || ch == 'B' || ch == 'T' || ch == 'F') {

      print("Enter From Location:  ")
      from = scala.io.StdIn.readLine()

      print("Enter To Location:  ")
      to = scala.io.StdIn.readLine()



      ch match {
        case 't' => println(s" Train is booked \n Booking Time:$todayDate \t From:$from \t To:$to ")
        case 'T' => println(s" Train is booked \n Booking Time:$todayDate \t From:$from \t To:$to")
        case 'f' => println(s" Flight is booked \n Booking Time:$todayDate \t From:$from \t To:$to")
        case 'F' => println(s" Flight is booked \n Booking Time:$todayDate \t From:$from \t To:$to")
        case 'b' => println(s" bus is booked \n Booking Time:$todayDate \t From:$from \t To:$to")
        case 'B' => println(s" bus is booked \n Booking Time:$todayDate \t From:$from \t To:$to")
      }


    }
    else {
      println("invalid Input")
    }







}
