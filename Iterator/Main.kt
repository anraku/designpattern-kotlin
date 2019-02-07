package main

import book.*

fun main(args: Array<String>){
  val bookShelf = BookShelf(4)
  bookShelf.appendBook(Book("Arond the World in 80 days"))
  bookShelf.appendBook(Book("Bible"))
  bookShelf.appendBook(Book("Cinderella"))
  bookShelf.appendBook(Book("Daddy-long-Legs"))

  var it = bookShelf.iterator()
  while (it.hasNext()) {
    val b = it.next() as Book
    println(b.name)
  }
}