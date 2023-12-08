package com.day2.objectandclass
//the name same as Singleton Object/class
class CompanionClass {

    def hello(){
      println("Hello, this is Companion Class.")
    }
  }
  object CompOb{
    def main(args:Array[String]){
      new CompanionClass().hello()
      println("And this is Companion Object.")
    }


}
