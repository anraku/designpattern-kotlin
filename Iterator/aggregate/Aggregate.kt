package aggregate

interface Aggregate {
  fun iterator(): Iterator<Any>
}