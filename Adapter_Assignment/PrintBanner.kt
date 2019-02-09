class PrintBanner(b: BannerBase) : Print(), BannerBase by b {
  override fun printWeak() {
    showWithParen()
  }

  override fun printStrong() {
    showWithAster()
  }
}