object Main {
  def main(args:Array[String]){
    val n = 3.14159
    var a = scala.io.StdIn.readDouble()
    var b = scala.io.StdIn.readDouble()

    println("MEDIA = %.5f".format((a * 3.5 + b * 7.5) / 11))
  }
}
