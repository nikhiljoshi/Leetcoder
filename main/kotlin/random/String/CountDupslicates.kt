package random.String

import java.util.Collections.max

fun longestChar(input:String):Char {
    val result =input.groupingBy {it} .eachCount ()

    println(max(result.values))

    println(getKey(result, max(result.values)))

    return getKey(result, max(result.values))

}

fun <K, V> getKey(map: Map<K, V>, target: V): K {
    return map.keys.first { target == map[it] };
}


fun main()
{
    val sampleString = "aaabbbbbccc"
    println("Longest repeating is :" + longestChar(sampleString))
    println("Longest repeating is :" + longestChar("aabbcccc"))
}