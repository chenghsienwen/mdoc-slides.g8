# some left align cover 
<!-- .element: style="text-align: left"  -->



# $package$

To install $package$
```scala
libraryDependencies += "com" % "lib" % "@VERSION@"
```

```scala mdoc
val x = 1
List(x, x)
```



# Markdown Demo
- open with new tab: [scala-with-cats2](https://underscore.io/blog/posts/2020/05/27/scala-with-cats-2.html)<!-- .element: target="_blank" -->


## code highlight

```scala[1-3|4-11|12-14|15-19]
trait Printable[A] {
  def format(a: A): String
}
object PrintableInstance {
  implicit val strPrint: Printable[String] = new Printable[String] {
    def format(a: String): String = a
  }
  implicit val intPrint: Printable[Int] = new Printable[Int] {
    def format(a: Int): String = a.toString
  }
}
object Printable {
  def format[A](a: A)(implicit p: Printable[A]): String = p.format(a)
}
object PrintableSyntax {
  implicit class PrintableOps[A](a: A)(implicit p: Printable[A]) {
    def show: String = p.format(a)
  }
}
```


## make table 

|                |ASCII                          |HTML                         |
|----------------|-------------------------------|-----------------------------|
|Single backticks|`'Isn't this fun?'`            |'Isn't this fun?'            |
|Quotes          |`"Isn't this fun?"`            |"Isn't this fun?"            |
|Dashes          |`-- is en-dash, --- is em-dash`|-- is en-dash, --- is em-dash|



## External 2

Content 2.1



## External 3.1

Content 3.1


## External 3.2

Content 3.2


## External 3.3

![External Image](https://s3.amazonaws.com/static.slid.es/logo/v2/slides-symbol-512x512.png)
