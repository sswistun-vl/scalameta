package objects

object X {
  object Y
}

object Foo {
  class C[A](x: Int)
}

class Y extends Foo.C(1)