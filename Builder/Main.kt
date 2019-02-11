fun main() {
  val builder = TextBuilder()
  val director = Director(builder)

  director.construct()
  println(builder.getResult())
}