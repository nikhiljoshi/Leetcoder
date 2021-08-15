import kotlinx.coroutines.*

import java.util.Calendar
fun main() {

    Solution().countSegments("This is my test passion")
}
class Solution {
    fun countSegments(s: String): Int {
        val trimmedStr = str.trim()
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







