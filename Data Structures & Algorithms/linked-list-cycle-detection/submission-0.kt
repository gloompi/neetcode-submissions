/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        var t = head
        var r = head

        while (r?.next != null) {
            r = r.next?.next
            t = t?.next

            if (r == t) {
                return true
            }
        }

        return false
    }
}
