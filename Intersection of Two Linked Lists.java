
 Intersection of Two Linked Lists

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        
        int lenA = len(headA);
        int lenB = len(headB);
        
        while(lenA > lenB){
            headA = headA.next;
            lenA--;
        }
        
        while(lenA < lenB){
            headB = headB.next;
            lenB--;
        }
        
        while(headA!=null && headB!=null){
            if(headA == headB){
                return headA;
            }else{
                headA = headA.next;
                headB = headB.next;
            }
        }
       
        return null;
    }
    
    public int len(ListNode node){
        int length = 1;
        
        if(node.next==null){
            return 1;
        }
        
        while(node.next!=null){
            node = node.next;
            length ++;
        }
        return length;
        
    }
        
}