package Numbers
//Reverse seqauence
fun main() {

    class Solution {

        fun reverseSeq(n: Int): List<Int> {

            return  (1..n).toList().reversed()
        }
    }

    println( Solution().reverseSeq(5))

}