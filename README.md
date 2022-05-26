# Purpose
pure scala version of https://github.com/jgperrin/net.jgp.books.spark.ch01

# Environment
- Java 11
- Scala 2.13.8
- Spark 3.2.1

# How to run
## 1, sbt package, in project root dir
When success, there a jar file at ./target/scala-2.13. The name is `main-scala-ch1_2.13-1.0.jar` (the same as name property in sbt file)

## 2, submit jar file, in project root dir
```
$ YOUR_SPARK_HOME/bin/spark-submit \
  --class net.jgp.books.spark.ch01.lab100_csv_to_dataframe.CsvToDataframeApp \
  --master local[2] \
  target/scala-2.13/main-scala-ch1_2.13-1.0.jar
```

## 3, output
```
+---+--------+--------------------+-----------+--------------------+
| id|authorId|               title|releaseDate|                link|
+---+--------+--------------------+-----------+--------------------+   
|  1|       1|Fantastic Beast...|   11/18/16|http://amzn.to/2k...|
|  2|       1|Harry Potter and ...|    10/6/15|http://amzn.to/2l...|
|  3|       1|The Tales of Beed...|    12/4/08|http://amzn.to/2k...|
|  4|       1|Harry Potter and ...|    10/4/16|http://amzn.to/2k...|
|  5|       2|Informix 12.10 on...|    4/23/17|http://amzn.to/2i...|
+---+--------+--------------------+-----------+--------------------+
```