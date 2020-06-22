package app

object ConsoleInput extends App{

  println("please provide input")
  println("1) "+"+")
  println("2) "+"-")
  val input  = scala.io.StdIn.readLine().charAt(0)



  input match {

    case 1 | '+' => println("u hv selected +"+input)
    case '-' => println("u hv selected -"+input)
    case _ => println("invalid")


  }



}
