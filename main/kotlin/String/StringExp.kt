
/*
You are given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.



Example 1:

Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
Example 2:

Input: s = "Hello"
Output: 1
Example 3:

Input: s = "love live! mu'sic forever"
Output: 4
Example 4:

Input: s = ""
Output: 0


Constraints:

0 <= s.length <= 300
s consists of lower-case and upper-case English letters, digits or one of the following characters "!@#$%^&*()_+-=',.:".
The only space character in s is ' '.



 */
fun main() {

   println(Solution().countSegments("This is my test passion"))
}
class Solution {
    fun countSegments(s: String): Int {
        val trimmedStr = s.trim()
        return if (trimmedStr.isEmpty()) {
            0
        } else {
            trimmedStr.split("\\s+".toRegex()).size
        }
    }
}
fun sentenceCount(str: String): Int {
    var temp:List<String> = str.split( ".")
   var result = 0

    temp.forEach {
        var couter = wordCount(it)
       if (couter>result)
            result =  couter

    }

    return result

}

fun  wordCount(str: String): Int
{
    val trimmedStr = str.trim()
    return if (trimmedStr.isEmpty()) {
        0
    } else {
        trimmedStr.split("\\s+".toRegex()).size
    }
}







