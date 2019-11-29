package example

class ForComprehension/*<=example.ForComprehension#*/ {
  for {
    a/*<=local1*/ <- List/*=>scala.collection.immutable.List.*/(1)
    b/*<=local2*/ <- List/*=>scala.collection.immutable.List.*/(1)
    if b/*=>local2*/ >/*=>scala.Int#`>`(+3).*/ 1
    c/*<=local7*/ = a/*=>local1*/ +/*=>scala.Int#`+`(+4).*/ b/*=>local2*/
  } yield (a/*=>local1*/, b/*=>local2*/, c/*=>local7*/)
  for {
    a/*<=local8*/ <- List/*=>scala.collection.immutable.List.*/(1)
    b/*<=local9*/ <- List/*=>scala.collection.immutable.List.*/(a/*=>local8*/)
    if (
      a/*=>local8*/,
      b/*=>local9*/
    ) ==/*=>java.lang.Object#`==`().*/ (1, 2)
    (
      c/*<=local19*/,
      d/*<=local20*/
    ) <- List/*=>scala.collection.immutable.List.*/((a/*=>local8*/, b/*=>local9*/))
    if (
      a/*=>local8*/,
      b/*=>local9*/,
      c/*=>local19*/,
      d/*=>local20*/
    ) ==/*=>java.lang.Object#`==`().*/ (1, 2, 3, 4)
    e/*<=local23*/ = (
      a/*=>local8*/,
      b/*=>local9*/,
      c/*=>local19*/,
      d/*=>local20*/
    )
    if e/*=>local23*/ ==/*=>java.lang.Object#`==`().*/ (1, 2, 3, 4)
    f/*<=local24*/ <- List/*=>scala.collection.immutable.List.*/(e/*=>local23*/)
  } yield {
    (
      a/*=>local8*/,
      b/*=>local9*/,
      c/*=>local19*/,
      d/*=>local20*/,
      e/*=>local23*/,
      f/*=>local24*/
    )
  }
}
