package Arrays



fun main()  {


    println(("aabbbcccc").groupingBy { it }.eachCount())
    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    println(numbersMap.keys.find { it == "n" })
    println(numbersMap.values)// null

    println(numbersMap.filter { (key,value)-> value == 3 })
    println(numbersMap.filterValues { it == 3 }.keys)
//numbersMap.getValue("six")
//sampleEnd
}
