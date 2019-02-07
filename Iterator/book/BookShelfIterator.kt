package book

import iterator.*

class BookShelfIterator(bs: BookShelf) : Iterator<Any> {
  var bookshelf = bs
  var index = 0

  override fun next(): Any {
    var b = bookshelf.getBookAt(index)
    index++
    return b as Any
  }

  override fun hasNext(): Boolean {
    return index < bookshelf.getLength()
  }
}