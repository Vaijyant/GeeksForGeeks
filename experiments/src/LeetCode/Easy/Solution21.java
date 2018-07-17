package LeetCode.Easy;

/**
 * Merge Two Sorted Lists
 * */

public class Solution21 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        ListNode head;

        if (l1.val <= l2.val) {
            head = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            head = new ListNode(l2.val);
            l2 = l2.next;
        }

        ListNode current = head;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                current.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            current = current.next;
        }


        ListNode remaining = null;
        if (l1 == null && l2 != null)
            remaining = l2;
        else if (l2 == null && l1 != null)
            remaining = l1;

        while (remaining != null) {
            current.next = new ListNode(remaining.val);
            current = current.next;
            remaining = remaining.next;
        }

        return head;
    }
}