import scala.math._
// Scala Does not allow multiple variable assignment in singe line
// The reason for this is that Scala places a strong emphasis on immutability and functional programming principles. 
// By disallowing multiple variable assignment, Scala encourages a more explicit and clear coding style.

object first{
    def main(args: Array[String]): Unit ={
        var k = 2
        var i = 2
        var j = 2
        var m = 5
        var n = 5
        var f = 12.0f
        var g = 4.0f
        var c = 'X'

        println(k + 12 * m)
        println(m / j)
        println(n % j)
        println(m / j * j)
        println(f + 10*5 +g)
        //Scala Programming Language does't support unary Operators like ++ and --, Hence (++i * n) this will give compile error
        i += 1
        println(i * n)
    }
}