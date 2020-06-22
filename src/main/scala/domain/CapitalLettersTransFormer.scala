package domain

import core.Transform
import error._

class CapitalLettersTransFormer extends Transform[List[String], Either[Error, List[String]]]{

  override def transform(input: List[String]): Either[Error, List[String]] = {
    Either.cond(input.isEmpty, input.map(_.toUpperCase), InvalidInput)
//    if(input.isEmpty) Left(InvalidInput)
//    else  Right(input.map(_.toUpperCase))
  }

}
