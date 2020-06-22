package error

sealed trait Error

final case class ErrorReadingFile(e: String) extends Error
final case class ErrorWritingFile(e: String) extends Error
case object InvalidInput extends Error
case object FileNotFound extends Error
