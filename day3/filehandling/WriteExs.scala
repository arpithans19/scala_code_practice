package com.day3.filehandling

import java.io.{File, PrintWriter}
import scala.io.Source

object WriteExs {

  def main(args: Array[String]) {

    // Creating a file
    val fileObject = new File("ScalaFile.txt")

    // Passing reference of file to the printwriter
    val printWriter = new PrintWriter(fileObject)

    // Writing to the file
    printWriter.write("Hi hi hi")

    printWriter.close()

    //source-iterable representation of Source file
    val fileSource = Source.fromFile(fileObject)

        //reading each character
        while (fileSource.hasNext) {
          println(fileSource.next)
        }

        //reading each line
        for(line<-fileSource.getLines){
          println(line)
        }




    fileSource.close()
  }


}
