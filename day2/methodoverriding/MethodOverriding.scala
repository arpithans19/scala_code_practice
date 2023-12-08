package com.day2.methodoverriding


class Vehicle {
  def run() {
    println("vehicle is running")
  }
}

class Bike extends Vehicle {
  override def run() {
    println("Bike is running")
  }
}

object MainObject {
  def main(args: Array[String]) {
    val b = new Bike()
    b.run()
  }

}
