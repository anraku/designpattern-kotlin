class TextBuilder : Builder {
  val builder = StringBuilder()

  override fun makeTitle(title: String) {
    builder.append("=========\n")
    builder.append("[" + title + "]\n")
    builder.append("\n")
  }

  override fun makeString(str: String) {
    builder.append(">> " + str + "\n")
    builder.append("\n")
  }

  override fun makeItems(items: Array<String>) {
    for (item in items) {
      builder.append(" " + item + "\n")
    }
    builder.append("\n")
  }

  override fun close() {
    builder.append("=========\n")
  }

  fun getResult(): String {
    return builder.toString()
  }
}
