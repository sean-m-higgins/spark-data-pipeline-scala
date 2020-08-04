import org.apache.spark.sql.{ DataFrame, Row, SparkSession }
import org.apache.spark.rdd.RDD

object Main extends App {
  println("Success!")

  // create spark session to have access to spark
  val spark: SparkSession = SparkSession
    .builder
    .master("local[*]")
    .appName(s"MainSparkApp")
    .getOrCreate()

  val rdd: RDD[Row] = spark.sparkContext.emptyRDD

  println(rdd)
  println("Success!")
  spark.close()
}
