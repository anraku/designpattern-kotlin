package idcard

import framework.*

class IDCard(val owner: String, val number: Int): Product() {
  init {
    println(owner + "のカードを作ります")
  }

  override fun use() {
    println(owner + "がNo." + number + "のカードを使います")
  }
}