/*
 * Problem
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // placeholder holding result of the linked list
        ListNode tail = dummyHead; // pointer for first element of list
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            // check list elements
            int digit1 = (l1 != null) ? l1.val : 0; 
            int digit2 = (l2 != null) ? l2.val : 0;

            // Example
            // 3 + 8 + 1 = 12 -> digit: 12 % 10 = 2 and carry: 12 / 10 = 1
            int sum = digit1 + digit2 + carry; 
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit); 
            tail.next = newNode; // add new digit to linked list
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next; // return dummyHead.next bcz, we don't want the value we have consider in it intially!!
        dummyHead.next = null;
        return result;
    }
}