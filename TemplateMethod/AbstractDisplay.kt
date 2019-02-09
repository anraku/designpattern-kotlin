abstract class AbstractDisplay {
  protected abstract fun open()
  protected abstract fun print()
  protected abstract fun close()
  fun display() {
    open()
    for (i in 1..5) {
      print()
    }
    close()
  }
}