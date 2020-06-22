package domain

import core.Reader
import error._

import scala.io.Source
import scala.util.{Failure, Success, Try}

class FileReader extends Reader[String, Either[Error, List[String]]]{

  override def read(filePath: String) = {
    if(filePath.isEmpty) Left(FileNotFound)
    else{
      Try(Source.fromFile(filePath).getLines()) match {
        case Success(value) => Right(value.toList)
        case Failure(e) => Left(ErrorReadingFile(e.toString))
      }
    }
  }

}
