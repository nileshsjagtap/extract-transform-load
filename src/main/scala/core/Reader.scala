package core

import java.io.File
import java.util.Properties

trait Reader[A, B] {

  def read(source: A): B

}

object Reader {
  implicit val fileReader = new Reader[File, Either[String, String]] {
    override def read(source: File) = ???
  }

  def apply(properties: Properties)(implicit as : Reader) = {
    as.read()
  }

}

Reader(proper)



