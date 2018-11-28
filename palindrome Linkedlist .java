
Palindrome Linked List


https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/772/


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


class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode newHead = null;


        while (fast != null && fast.next != null) {
            fast = fast.next.next; //移動至底部

            ListNode next = head.next;		//另一半reverse
            head.next = newHead;
            newHead = head;
            head = next;
        }

        if (fast != null) {
            head = head.next;  //若為奇數在往前1格
        }

        while (newHead != null) {              //example 1 - >2        2->1
														newHead  head
            if (newHead.val != head.val) {
                return false;
            }
            newHead = newHead.next;
            head = head.next;
        }

        return true;
    }
}