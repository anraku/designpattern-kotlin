package factory

import java.io.*

abstract class Factory {
  abstract fun createLink(caption: String, url: String): Link
  abstract fun createTray(caption: String): Tray
  abstract fun createPage(title: String, author: String): Page
  companion object {
    fun getFactory(classname: String): Factory?{
      var factory: Factory? = null
      try {
        factory = Class.forName(classname).newInstance() as Factory?
      } catch (e: Exception) {
        e.printStackTrace()
      }
      return factory
    }
  }
}