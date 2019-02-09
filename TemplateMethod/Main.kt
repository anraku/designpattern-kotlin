fun main() {
  val d = CharDisplay("hello")
  d.display()
  // d.print() //←スーパークラスのprotected指定子によってアクセスエラーになる
}