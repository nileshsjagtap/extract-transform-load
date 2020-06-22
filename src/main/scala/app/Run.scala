package app

import domain.{CapitalLettersTransFormer, FileReader, FileWriter}

object Run extends App {

  val fileReader = new FileReader
  val capitalTransformer = new CapitalLettersTransFormer
  val fileWriter = new FileWriter


  val result = for {

    fileLines <- fileReader.read("target/resources/inputFile")
    capitalizedData <- capitalTransformer.transform(fileLines)
    outputFile <- fileWriter.write(capitalizedData, "target/resources/outputFile")

  } yield {
    outputFile
  }

  result.fold(println , d => println(fileReader.read(d)))

}
