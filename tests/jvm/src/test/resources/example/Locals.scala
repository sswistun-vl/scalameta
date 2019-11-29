package locals

object Test/*<=locals.Test.*/ {
  val xs/*<=locals.Test.xs.*/ = {
    val x/*<=local1*/ = 42
    List/*=>scala.collection.immutable.List.*/(x/*=>local1*/)
  }
}
