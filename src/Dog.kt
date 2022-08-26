open class Dog(val name: String, val age: Int): Pet() {
    // не получилось переназначить, при создании объекта barsik в main, создался companion object
  //  override fun voice() {
    //    println("gav-gav")
   // }

    companion object {
        fun voice() {
           println("gav-gav")
        }
    }

    override fun color() {
        super.color()
    }
}