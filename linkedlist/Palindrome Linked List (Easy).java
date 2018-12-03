
Palindrome Linked List (Easy)

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null )return true;
        if(head.next == null) return true;
        
        ListNode temp = head;
        Stack<Integer> stack = new Stack<>();
        
        while(temp!=null){
            stack.push(temp.val);
            temp = temp.next;
        }
        
        while(!stack.isEmpty()){
            if(stack.pop() != head.val){
                return false;
            }else{
                head = head.next;   
            }
        }
        return true;
    }
}