package com.task

import scala.annotation.tailrec

object RecursionFunction {

    def func(a: Int, b: Int): Int =
    {
      @tailrec def scaler(x:Int, y:Int): Int=
      {
        if (y == 0) x
        else scaler(y, x % y)
      }
      scaler(a, b)
    }
    def main(args:Array[String])
    {
      println(func(2, 1))
    }


}
