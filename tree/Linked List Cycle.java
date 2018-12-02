
Linked List Cycle


public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next ==null) return false;
        ListNode i = head;
        ListNode j = head;
        
        while(j!=null && j.next!=null){
            i= i.next;
            j= j.next.next;
            if(i == j) return true;
        
        }
        
        return false;
    }
}