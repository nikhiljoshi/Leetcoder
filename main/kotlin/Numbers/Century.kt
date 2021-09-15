package Numbers
//Reverse seqauence
fun main() {

    class Solution {

        fun century(number: Int): Int {

            return if (number.rem(100)==0) {
                number.div(100)
            } else {
                number.div(other = 100)+1
            }
        }
    }

    println( Solution().century(1705))
    println( Solution().century(1900))
    println( Solution().century(1601))
    println( Solution().century(2000))
    println( Solution().century(89))




}