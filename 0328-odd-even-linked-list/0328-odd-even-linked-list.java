/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode odd_pointer = odd;
        ListNode even_pointer = even;
        int count = 1;
        while (head != null) {
            if (count % 2 == 0) {
                even_pointer.next = head;
                even_pointer = even_pointer.next;
            } else {
                odd_pointer.next = head;
                odd_pointer = odd_pointer.next;
            }
            head = head.next;
            count++;
        }
        even_pointer.next = null;
        odd_pointer.next = even.next;
        return odd.next;
    }
}