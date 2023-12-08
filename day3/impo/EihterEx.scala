package com.day3.impo

object EihterEx {
  def main(args: Array[String]): Unit = {
    def Name(name: String): Either[String, String] = {

      if (name.isEmpty)
        Left("There is no name.-failure")

      else
      //success
        Right(name)
    }


    println(Name("Arpitha"))


    println(Name(""))

  }
  def Division(q: Int, r: Int): Either[String, Int] =
  {
    if (q == 0)
      Left("Division not possible.")
    else
      Right(q / r)
  }


  val x = Division(4, 2)
  x match
  {
    case Left(l) => println("Left: " + l)
    case Right(r) =>println("Right: " + r)



  }

}
