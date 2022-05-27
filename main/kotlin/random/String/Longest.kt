package random.String

fun main()
{
    class Solution
    {

        fun longest(s1:String, s2:String):String {

            var result =(s1 + s2).toSortedSet()
            var temp :StringBuffer = StringBuffer()
            result.forEach { temp.append(it) }

            return temp.toString()
        }
    }

    println( Solution().longest("aretheyhere", "yestheyareher"))

}


