class PrintBanner(override val string: String): Banner(string) {
  fun printWeak() {
    showWithParen()
  }

  fun printStrong() {
    showWithAster()
  }
}