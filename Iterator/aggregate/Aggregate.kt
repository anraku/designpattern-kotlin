package aggregate

interface Aggregate<out T> {
  fun iterator(): T
}