package book

import aggregate.*


class BookShelf(maxsize: Int) : Aggregate<BookShelfIterator> {
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