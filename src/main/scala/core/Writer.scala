package core

trait Writer[A,B,C] {

  def write(value: A, source: B) : C

}
