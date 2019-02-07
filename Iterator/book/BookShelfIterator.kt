package book

import iterator.*

class BookShelfIterator(bs: BookShelf) : Iterator<Book?> {
  var bookshelf = bs
  var index = 0

  override fun next(): Book? {
    var b = bookshelf.getBookAt(index)
    index++
    return b
  }

  override fun hasNext(): Boolean {
    return index < bookshelf.getLength()
  }
}