package com.day3.Collections
//Stream is a lazy list. It evaluates elements only when they are required.
//end of stream not evaluate

object StreamsEx {
  def main(args: Array[String]) {
    val stream = 12 #:: 13 #:: 15 #:: Stream.empty
    println(stream)

    val stream2 = (1 to 10).toStream
    println(stream2)

    println("Head: " + stream.head)
    println(stream.tail)
    println("1st 3 elements: " + stream2.take(3))
    println("Mapping: " + stream.map {
      _ * 2
    })
    println("Filtering: " + stream2.filter(_ > 2))
    println("Size of Stream: " + stream.size)
    println("max: " + stream.max)
    println(stream.sum)
    println(stream)

    println("All elemts: ")
//    stream2.foreach(x => println(x+1))
    println(stream2)
  }

}
