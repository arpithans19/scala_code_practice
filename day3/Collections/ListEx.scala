package com.day3.Collections

import scala.collection.mutable.ListBuffer


object ListEx {
  def main(args: Array[String]) {
    val ls = List(1, 2, 3,6)
    val ls2: List[String] = List("jkj", "abc", "xyz")
    println("List1: " + ls)
    println("List2: " + ls2)

    //adding element in 1st
    print("Pre-appending: ")
    println(0 :: ls)
    println("Adding-append():" + ls.appended(23))

    //mutable
    val listBuffer = new ListBuffer[Int]()
    listBuffer += 1
    listBuffer += 22
    println("listBuffer: " + listBuffer)

    //Nil method-create list
    print("Nil:- ")
    println(1 :: 5 :: 9 :: Nil)

    //fill methos
    print("Fill method: ")
    println(List.fill(6)(2, 3))

    val l=9 :: ls
    println(l)

    print("Iterating Elelments:-")
    ls.foreach((element: Int) => print(element + " "))

    println("makestring: " + ls.mkString)
    println("Find element by index: " + ls(2))
    println("Reverse: " + ls.reverse)
    println("Sorted list-:" + ls.sorted)
    println("Head: " + ls.head)
    println("Tail: " + ls.tail)


    //merging 2 lists
    val ls3 = ls ++ ls2
    val ls4 = ls2 ::: ls
    val ls5 = ls2.appendedAll(ls)
    print("merging 2 lists: ")
    println(ls)
    println(ls3)
    println(ls4)
    println(ls5)

  println(List.range(1,29))
    println(List.range(0,20,2))
    println("Fold "+ls.fold(6)(_+_))

    println(ls.find(i => i % 2 == 0 && i > 4))
    println(ls.exists(x => x > 1))
    println(ls.exists(_ < 0))
    val result = ls.forall(y => {y % 3 == 0})
    println(result)



  }

}
