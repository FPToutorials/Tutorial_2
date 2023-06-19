//Scala Programming Style
object first{
    def main(args: Array[String]): Unit ={
        var a = 2
        var b = 3
        var c = 4
        var d = 5
        var g = 4.0f
        var k = 4.3f

        b=b-1
        println(b * a + c * d)
        d=d-1
        println(a)
        a=a+1
        println (-2 * ( g - k ) +c)
        println (c)
        c=c+1
        c=c+1
        println (c*a)
        a=a+1
    }
}

//Java Program

// public class PrimitiveNarrowing{
// 	public static void main (String[] args){
// 		int a = 2, b = 3, c = 4, d = 5;
// 		float k = 4.3f, g = 4.0f;

// 		System.out.println(--b * a + c *d--);
// 		System.out.println(a++);
// 		System.out.println(-2*( g-k )+c);
// 		System.out.println(c=c++);
// 		System.out.println(c=++c * a++);
// 	}
// }

//In Java Programming we can use multiple variable assignment in one line
//As well as we will be able to use incremental operator and decremental operator