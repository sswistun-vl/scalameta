package objects

object X/*<=objects.X.*/ {
  object Y/*<=objects.X.Y.*/
}

object Foo/*<=objects.Foo.*/ {
  class C/*<=objects.Foo.C#*/[A/*<=objects.Foo.C#[A]*/](x/*<=objects.Foo.C#x.*/: Int/*=>scala.Int#*/)
}

class Y/*<=objects.Y#*/ extends Foo.C/*=>objects.Foo.C#*/(1)