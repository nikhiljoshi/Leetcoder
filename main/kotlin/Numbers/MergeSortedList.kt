package Numbers
/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 */
class MergeSortedList {

    /**
     * Example:
     * var li = ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     *
     */
    class ListNode(var nodes: Int) {
           var next: ListNode? = null
        }
    class Solution {
        fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

           // return  li
        }
    }
}

fun main() {
    var list1= MergeSortedList.ListNode(5)
    var v = list1.nodes
    var list1= MergeSortedList.ListNode(5)
    var v = list1.nodes
    println(MergeSortedList.Solution().mergeTwoLists())
}

