class TextBuilder : Builder() {
  val builder = StringBuilder()

  override fun buildTitle(title: String) {
    builder.append("=========\n")
    builder.append("[" + title + "]\n")
    builder.append("\n")
  }

  override fun buildString(str: String) {
    builder.append(">> " + str + "\n")
    builder.append("\n")
  }

  override fun buildItems(items: Array<String>) {
    for (item in items) {
      builder.append(" " + item + "\n")
    }
    builder.append("\n")
  }

  override fun buildClose() {
    builder.append("=========\n")
  }

  fun getResult(): String {
    return builder.toString()
  }
}
