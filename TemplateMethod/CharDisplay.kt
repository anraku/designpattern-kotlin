class CharDisplay(val str: String): AbstractDisplay() {
  override fun open() {
    print("<<")
  }

  override fun print() {
    print(str)
  }

  override fun close() {
    print(">>")
  }
}