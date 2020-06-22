package domain

import java.io.PrintWriter

import core.Writer
import error._

import scala.util.{Failure, Success, Try}

class FileWriter extends Writer[List[String], String, Either[Error, String]]{

  override def write(value: List[String], source: String) = {
    val writer = new PrintWriter(source)
    Try {
      writer.write(value.mkString("\n"))
    } match{
      case Success(_) => writer.close(); Right(source)
      case Failure(exception) => writer.close(); Left(ErrorWritingFile(exception.toString))
    }
  }

}
