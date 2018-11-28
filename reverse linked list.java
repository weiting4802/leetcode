Reverse Linked List

https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/560/


class Solution {
    public ListNode reverseList(ListNode head) {
    if(head == null || head.next == null) return head;
       
        ListNode newNode = reverseList(head.next);
        ListNode nextNode = head.next;
        nextNode.next = head;
        head.next = null;
      
       return newNode;
           
    }