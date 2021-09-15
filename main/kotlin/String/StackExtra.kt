package String

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


    class Solution {
         fun generateParenthesis(n: Int): List<String> {
             val openingE = "("
             val closingE = ")"
             var counter =n
             var result: Stack<String> = Stack()

                 var numbersToPush =counter/2
                while (numbersToPush>0){
                    result.push(openingE)
                    numbersToPush--
                }
              numbersToPush =counter/2
             while (numbersToPush>0){
                 result.push(closingE)
                 numbersToPush--
             }

            var resultString =StringBuffer()
             val numbers = listOf("one", "two", "three", "four")
             println(numbers)
             println(numbers.joinToString())
             val listString = StringBuffer("The list of numbers: ")
             numbers.joinTo(listString)
             println(listString)

             return result.toList()
         }


    }

    println(Solution().generateParenthesis(6))


}




