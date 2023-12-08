package com.day3.Collections
import scala.collection.immutable.Queue

//mainatin insertion oreder
//allows duplicates

object QueueEx {
  def main(args: Array[String]) {
    val queue1 = Queue(5, 6, 2, 3, 9, 5, 2, 5)
    val queue2: Queue[Int] = Queue(1, 5, 6, 2, 3, 9, 5, 2, 5)
    println(queue1)
    println(queue2)

    println("\nQueue Elements: ")
    queue1.foreach((element:Int)=>print(element+" "))

    println("Enqueue/adding elements:- "+queue1.enqueue(90))
    println("adding: "+ queue1.appended(23))
    println("reverse:- "+queue1.reverse)
    println("Dequeue:- "+queue1.dequeue)
    println("Enqueue: "+queue1.enqueue(100))
    println("Sorted:- "+queue1.sorted)
    println("Front:- "+queue1.head)

    println(queue1(0))
    println(queue1.find(i => i % 2 == 0 && i > 4))
    println(queue1.exists(x => x > 1))
    println(queue1.exists(_ < 0))







  }

}
