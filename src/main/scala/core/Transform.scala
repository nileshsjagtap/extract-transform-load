package core

trait Transform[A,B] {

  def transform(input: A): B

}
