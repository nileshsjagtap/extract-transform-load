package domain

import org.specs2.mock.Mockito
import org.specs2.mutable.Specification

class FileReaderTest extends Specification with Mockito {


  "FIleReader" should {
    "read content from file" in{
      val filePath = "target/test/testInput.txt"
      val fileReader = new FileReader
      fileReader.read(filePath) must beRight(List("abcd"))
    }
  }
}
