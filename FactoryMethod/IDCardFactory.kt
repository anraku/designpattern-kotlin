package idcard

import framework.*

class IDCardFactory: Factory() {
  val owners = ArrayList<OwnerSerialMap>()
  var serial_number: Int = 1

  override protected fun createProduct(owner: String): Product {
    val card = IDCard(owner, serial_number)
    serial_number++
    return card
  }

  override protected fun registerProduct(product: Product) {
    if (product is IDCard) {
      val owner = OwnerSerialMap(product.owner, product.number)
      owners.add(owner)
    }
  }
}

class OwnerSerialMap(var owner: String, var number: Int)