package net.jgp.books.spark.ch01.lab100_csv_to_dataframe

import org.apache.spark.sql.SparkSession

object CsvToDataframeApp {
  def main(args: Array[String]) {
    val spark = SparkSession.builder.
      appName("CSV to Dataset").
      getOrCreate()

    val csvFile = "./data/books.csv"

    val df = spark.read.format("csv")
      .option("header", "true")
      .load(csvFile)

    df.show(5)
  }
}
