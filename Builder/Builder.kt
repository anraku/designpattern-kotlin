abstract class Builder {
  var initialized = false
  fun makeTitle(title: String) {
    if (!initialized) {
      buildTitle(title)
      initialized = true
    } else {
      error("makeTitle must be called only once")
    }
  }

  fun makeString(str: String) {
    if (initialized) {
      buildString(str)
    } else {
      error("makeTitle must be called only once before makeString")
    }
  }

  fun makeItems(items: Array<String>) {
    if (initialized) {
      buildItems(items)
    } else {
      error("makeTitle must be called only once before makeItems")
    }
  }

  fun close() {
    if (initialized) {
      buildClose()
    } else {
      error("makeTitle must be called only once before close")
    }
  }

  protected abstract fun buildTitle(title: String)
  protected abstract fun buildString(str: String)
  protected abstract fun buildItems(items: Array<String>)
  protected abstract fun buildClose()
}