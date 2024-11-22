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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // StringBuilder num1 = new StringBuilder();
        // StringBuilder num2 = new StringBuilder();
        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        while (l1 != null || l2 != null || carry != 0) {
            int num1 = 0;
            int num2 = 0;
            int sum = carry;
            if (l1 != null) {
                num1 = l1.val;
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                num2 = l2.val;
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;
        }

        return res.next;
    }
}