/**
  * Created by kevinduraj on 1/30/16.
  */

import com.datastax.spark.connector._
import org.apache.spark.{SparkConf, SparkContext}
import scala.math.BigDecimal.RoundingMode

case class Category(category_name: String)

object Kevin {

  def main(args: Array[String]) {

    val conf = new SparkConf(true).setAppName("Kevin")
    val sc = new SparkContext(conf)
    val cat = sc.cassandraTable("retail", "products_by_category_name").select("category_name").as(Category)

    println("Total Categories: " + cat.cassandraCount())

  }
}
