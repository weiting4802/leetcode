
Linked List Cycle

https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/773/


public class Solution {
      public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
          
        if(head == null || head.next == null) return false;
        
        while(fast!=null && fast.next!=null){
           fast = fast.next.next;
           slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;    
      }
    
	

	