// kotlinで移譲を行うにはinterfaceを用意する必要がある
interface BannerBase {
  fun showWithParen()
  fun showWithAster()
}

class Banner(val string: String): BannerBase {
  override fun showWithParen() {
    println("(" + string + ")")
  }

  override fun showWithAster() {
    println("*" + string + "*")
  }
}