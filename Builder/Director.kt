class Director(val builder: Builder) {
  fun construct() {
    builder.makeTitle("Greeting")
    builder.makeString("morning to afternoon")
    builder.makeItems(arrayOf("good morning", "good afternoon"))
    builder.close()
  }
}