package com.akka.day1

import akka.actor.{Actor, ActorSystem, Props}

class SimpleProgram extends Actor {
  def receive = { //  Receiving message
    case msg: String => println(msg + self.path.name)
    case msg1: Double => println(msg1 + self.path.name)
    case _ => println("Unknown message") // Default case


  }
}

object Main {
  def main(args: Array[String]) {
    val actorSystem = ActorSystem("ActorSystem")
    val actor = actorSystem.actorOf(Props[SimpleProgram])
    val actor1 = actorSystem.actorOf(Props[SimpleProgram])
    actor ! "Hello Akka"
    actor1 ! "HelLO akka1"
    actor ! 100.52
  }
}