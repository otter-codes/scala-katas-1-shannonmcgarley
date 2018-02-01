package example

import scala.io.StdIn

object Kata extends App {

val EnterAWord = StdIn.readLine("Enter A Word " )
  println(EnterAWord.tail.init)
}

