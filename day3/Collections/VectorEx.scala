package com.day3.Collections
//It provides random access of elements.
//immutable

object VectorEx {
  def main(args: Array[String]) {

    val v1 = Vector.empty
    println("Empty vector-:  "+Vector.empty)

    val vector1 = Vector("aaa", "bbb", "ccc")
    val vector2 = Vector("eee","fff","ggg")
    print("Vector Elements: ")
    vector1.foreach((element:String) => print(element+" "))

    println("\nAdding")
    val newVector = vector1 :+ "ffff"
    val multiAppend=vector1 ++ Vector("l","h","u")
    val prepend="xyz"+:vector1
    val multiPrepedn=Vector("ooo", "ss") ++: vector1
    println("Prepending : "+prepend)
    println("Multiple values prepend: "+multiPrepedn)
    println("Multiple values adding: "+multiAppend)
    println(" after adding: "+newVector)

    //merging 2 vectors
    val mergedVector = newVector ++ vector2
    println("vector Elements after merging: ")
    mergedVector.foreach((element:String) => println(element+" "))
    println("Reverse vector:- "+mergedVector.reverse)
    println("Sorted vector:- "+mergedVector.sorted)
    println("Append vector:- "+mergedVector.appended("th"))
    println("Sorted vector:- "+mergedVector.sorted)



  }
}

