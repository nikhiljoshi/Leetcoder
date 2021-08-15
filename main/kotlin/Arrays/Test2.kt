import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Month
import java.time.format.DateTimeFormatter
import java.util.*


fun main() {
    var transact = intArrayOf(100, 115, -10, -50, -50)
    var datearray = arrayOf("2020-01-01", "2020-02-01", "2020-02-11", "2020-02-05", "2020-02-08")

    println(solution(transact, datearray))


}

fun solution(A: IntArray, D: Array<String>): Int {
    // write your code in Kotlin 1.3.11 (Linux)

    var income = A.toList().sum()

    var mapToTest = mutableMapOf<Int, Month>()

    D.forEachIndexed { index, it ->
        mapToTest.put(A.get(index), getMonth(D.get(index)))
    }


    var feesToTake = 12 - (mapToTest.keys.filter { it > 100 }.count())

    return income - (feesToTake * 5)
}

private fun isSameMONTHy(date1: String, date2: String): Boolean {
    val pattern = "yyyy-MM-dd"
    val simpleDateFormat = SimpleDateFormat(pattern)

    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH)

    return LocalDate.parse(date1, formatter).month == LocalDate.parse(date2, formatter).month
}

private fun getMonth(date1: String): Month {
    val pattern = "yyyy-MM-dd"
    val simpleDateFormat = SimpleDateFormat(pattern)

    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH)

    return LocalDate.parse(date1, formatter).month
}
