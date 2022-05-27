package random.Numbers
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

    var test: String? = null

    if (test !=null)
    {
        println("------")
    }


    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers.groupBy { it.first().toUpperCase() })
    println(numbers.groupBy(keySelector = { it.first() }, valueTransform = { it.toUpperCase() }))

    val numbers1 = listOf("one", "two", "three", "four", "five", "six")
    println(numbers1.groupingBy { it.first() }.eachCount())
}