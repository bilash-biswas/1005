import java.util.Scanner
fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var num1 = read.nextFloat()
    var num2 = read.nextFloat()

    println("MEDIA = %.5f".format((num1 * 3.5 + num2 * 7.5) / 11))
}
