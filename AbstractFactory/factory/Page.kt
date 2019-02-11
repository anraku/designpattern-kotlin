package factory

import java.io.*

abstract class Page(protected val title: String, protected val author: String) {
  protected val content = ArrayList<Item>()

  fun add(item: Item) {
    content.add(item)
  }

  fun output() {
    try {
      val filename: String = title + ".html"
      val file = FileWriter(filename)
      val writer = PrintWriter(BufferedWriter(file))

      writer.write(this.makeHTML())
      writer.close()
      println("created" + filename)
    } catch (e: IOException) {
      e.printStackTrace()
    }
  }

  abstract fun makeHTML(): String
}