package com.day3.Collections

import scala.collection.immutable.{HashSet, ListSet}
import scala.collection.{BitSet, SortedSet}


object SetsEx {
  def main(args: Array[String]) {

    val set1 = Set()
    println("An empty set: " + set1)

    val alphabets = Set("a", "A", "B", "C", "c", "d", "b")
    var subjects = Set("java", "scala", "sql", "mongodb")
    println(alphabets)
    println("First element of Set: " + alphabets.head)
    println("Except first element: " + alphabets.tail)
    println("Set IsEmpty(): " + alphabets.isEmpty)
    println("Elements in Subjects set: " + subjects.size)
    println("Elements in alphabet set: " + alphabets.size)

    //merging
    val mergeSet = alphabets ++ subjects
    println("\nMergeSet: " + mergeSet)
    println("Elements in mergeSet: " + mergeSet.size)

    //contains()-checking whether element is there or not
    println("\njava exists in the set : " + subjects.contains("java"))
    println("Java exists in the set : " + subjects.contains("Java"))

    // Adding new element
    subjects += "html"
    println("\nafter adding 1 elemnt" + subjects)


    //if elemt is not there,return set -dnt show error
    subjects -= "ja"
    println("after removing 1 elemnt" + subjects)

    //iterating-for()
    //    var subject = Set("java", "scala", "sql", "mongodb", "lll")
    println("\niterated set -using for() loop: ")
    for (s <- subjects) {
      println(s)

    }

    //iterating-forEcah()
    println("\niterated set -using forEach() loop: ")
    alphabets.foreach((element: String) => println(element))

    // intersect() and &-return same elemts in both set
    //union- join both sets
    val a1 = Set("Peacock", "India", "Tiger")
    val a2 = Set("ppp", "Karnataka", "Tiger")
    println("\nIntersect()-return same elemts in both set: " + a1.intersect(a2))
    println("Intersection-using &: " + (a1 & a2))
    println("Union-using union: " + a1.union(a2))

    //sorting
    println("\nSorting using-SortedSet")
    val numbers: SortedSet[Int] = SortedSet(5, 8, 1, 2, 9, 6, 4, 7, 2)
    numbers.foreach((element: Int) => println(element))

    val a3: SortedSet[String] = SortedSet("a", "B", "f", "c")
    a3.foreach((sa: String) => println(sa))

    //Hashset
    println("\nHashSet-used to store elements-no insertion order")
    val hashSet = HashSet(4, 2, 8, 0, 6, 3, 45,-1)
    hashSet.foreach((element: Int) => print(element + " "))

    //BitSet
    var bs = BitSet(1,6,37)
    println("\nBit set:-" + bs)
    bs.foreach((element: Int) => println(element))
    bs += 16
    println(bs++BitSet(3,9))
    println(bs(99))
    println("\n adding to bitset:-" + bs)
    bs -= 0
    println("\n removing from bitset:-" + bs)

    //ListSet-maintain insertion order
    val ls = ListSet(4, 2, 8, 0, 6, 3, 45)
    println("\nList set:-" + ls)
    ls.foreach((element: Int) => print(element + " "))

    val ls1:ListSet[String] = new ListSet()
    println(" \nempty ListSet by using constructor:- "+ls1)

    val ls2:ListSet[String] = ListSet.empty
    println("\n Creating an empty listset :-"+ls2)









  }


}