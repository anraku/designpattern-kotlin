package iterator

interface Iterator<out T> {
  fun hasNext(): Boolean
  fun next(): T
}