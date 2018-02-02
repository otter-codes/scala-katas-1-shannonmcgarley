package example

import scala.io.StdIn

object Kata extends App {

val EnterAWord = StdIn.readLine("Enter A Word " )

  removeFandLletter(EnterAWord)

  def removeFandLletter(word : String) {

    if (word.length < 2) {
      println("")
    }
    else{
      println(EnterAWord.tail.init)
    }
  }
}

