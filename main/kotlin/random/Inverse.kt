package random.Numbers
//Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
//
//invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
//invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
//invert([]) == []

fun main() {

    class Solution {

        fun invert(arr: IntArray): IntArray {

            return  IntArray(arr.size){ -arr[it] }
        }
    }

    println( Solution().invert(intArrayOf(1,2,3,4,5)).toString())

}