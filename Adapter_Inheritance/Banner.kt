open class Banner(open val string: String) {
  fun showWithParen() {
    println("(" + string + ")")
  }

  fun showWithAster() {
    println("*" + string + "*")
  }
}