//4.	Find the number is odd or even by using Control Flow inside println() method.

fun main() {
    print("enter number: ")
    var num = readLine()!!.toInt()
    if(num%2==0)
    {
        println("Even!")
    }
    else
    {
        println("Odd!")
    }
}
