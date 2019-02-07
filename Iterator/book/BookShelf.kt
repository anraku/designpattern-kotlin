package book

import iterator.*
import aggregate.*


class BookShelf(maxsize: Int) : Aggregate {
  var books: Array<Book?> = arrayOfNulls(maxsize)
  var last = 0

  fun getBookAt(index: Int): Book? {
    return books[index]
  }

  fun appendBook(book: Book) {
    this.books[last] = book
    last++
  }

  fun getLength(): Int {
    return last
  }
  
  override fun iterator(): BookShelfIterator {
    return BookShelfIterator(this)
  }
}