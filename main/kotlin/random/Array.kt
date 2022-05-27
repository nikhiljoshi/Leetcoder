package random.Numbers
//Reverse seqauence
fun main() {

    class Solution {

        fun reverseSeq(n: Int): List<Int> {

            return  (1..n).toList().reversed()
        }
    }

   // println( Solution().reverseSeq(5))

    val str: String? = null


    if (str != null) {
        println("--${str.length}")
    }
    println(str?.length)
    println(str!!.length)

}