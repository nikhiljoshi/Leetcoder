package random.String

import java.util.*

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
 */
fun main() {
//    println("Is input string valid--" + Solution().isValid("{}[]{[()]}"))
//    println("Is input string valid--" + Solution().isValid("{}{[[[]]{"))
//    println("Is input string valid--" + Solution().isValid("{}[]{[[)]}"))
    println("Is input string valid--" + Solution().isValid("{]"))
    println("Is input string valid--" + Solution().isValid("{}"))
}


class Solution {
    fun isValid(s: String): Boolean {

        val openingCurly = '{'
        val closingCurly = '}'
        val openingSquare = '['
        val closingSquare = ']'
        val openingE = '('
        val closingE = ')'

        var result: Stack<Char> = Stack()

        s.forEach {
            when (it) {
                openingCurly -> result.push(openingCurly)
                openingE -> result.push(openingE)
                openingSquare -> result.push(openingSquare)
                closingE ->  {if (result.peek().equals(openingE)) result.pop() else return false}
                closingSquare-> {if (result.peek().equals(openingSquare)) result.pop() else return false}
                closingCurly ->  {if (result.peek().equals(openingCurly)) result.pop() else return false}
            }
        }

        return result.isEmpty()
    }
}


