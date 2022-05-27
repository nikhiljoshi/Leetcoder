package random.Numbers.HashTable


fun main() {
    var datearray = intArrayOf(1,2,3,1)

    println(Solution().containsDuplicate(datearray))


}

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.toSet().size != nums.size
    }
}
