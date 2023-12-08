package com.day3.Collections

import scala.collection.immutable.{HashMap, ListMap}
import scala.collection.mutable._

object MapsEx {
  def main(args: Array[String]) {

    val emptyMap: Map[String, String] = Map.empty[String, String]
    val empty = Map.empty
    println(emptyMap)
    println(empty)

    val map1 = Map(("A", "abc"), ("B", "xyz"))
    val map2 = Map("Z" -> "Apple", "B" -> "Ball", "B" -> "Ball")

    println("map1: " + map1)
    println("map2: " + map2)


    //adding elements
    map1 += ("C" -> "arp", "D" -> "rav")
    println(map1)
    val addMap = map1 + ("C" -> "qrs")
    println("Adding element " + addMap)


    //removing by Key
    println("Removing elemnts:" + map2.remove("Z"))
    println(addMap - "B")

    println("Accessing value by  key   " + map1("A"))


    //HashMap
    val hashMap = HashMap("Z" -> "abc", "B" -> "kkk", "C" -> "cvb")
    println(hashMap)

    // Iterating elements- using pattern matching
    hashMap.foreach {
      case (key, value) => println(key + " - " + value)
    }


    println("find element by key: " + hashMap("B"))


    //ListMap
    //It maintains insertion order and returns ListMap
    var listMap = ListMap("apple" -> "100", "orange" -> "50", "grapes" -> "500")
    println(listMap)

    //iterating
    println("\nIterating")
    listMap.foreach {
      case (key, value) => println(key + "->" + value)
    }

    //fetching value
    println("fetching value: " + listMap("grapes"))
    println("IsEmpty: " + listMap.isEmpty)


    //  flatMap
    val portal = Seq("Kolar", "gold", "Field")
    val result = portal.flatMap(_.toUpperCase)

    val x=List(1,2,3)

    println(result)


  }

}
