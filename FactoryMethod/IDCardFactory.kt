package idcard

import framework.*

class IDCardFactory: Factory() {
  val owners = ArrayList<String>()

  override protected fun createProduct(owner: String): Product {
    return IDCard(owner)
  }

  override protected fun registerProduct(product: Product) {
    if (product is IDCard) {
      owners.add(product.owner)
    }
  }
}