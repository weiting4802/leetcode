
Add Two Numbers II

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        
        int carry = 0;
               
        while(l1!=null){
            s1.push(l1);
            l1 = l1.next;
        }
        
        while(l2!=null){
            s2.push(l2);
            l2= l2.next;
        }
        
        
        
        ListNode result = new ListNode(0);
        
        while(!s1.isEmpty() || !s2.isEmpty() || carry!=0){
            int n1 = s1.isEmpty() ? 0 : s1.pop().val;
            int n2 = s2.isEmpty() ? 0 : s2.pop().val;
            int value = (n1+n2+carry)%10;
            ListNode node = new ListNode(value);
            node.next = result.next;
            result.next = node;
            carry = (n1+n2+ carry)/10;
        }
        return result.next;

        
    }
}