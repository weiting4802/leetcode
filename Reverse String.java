Reverse String

https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1183/


class Solution {
    public String reverseString(String s) {
        if(s.length() == 1 || s.length() == 0) return s;
        
//         int i = 0;
//         int j = s.length()-1;
//         String right = "", left = "";
//         while(i < j){
//             left += s.charAt(j);
//             right = s.charAt(i) + right;
//             i++;
//             j--;
//         }
        
//         if(s.length() % 2 == 1){
//             return left + s.charAt(s.length()/2) + right;
//         }
//         return left + right;
        
        
         int start=0,end=s.length()-1;
        char[] arr= s.toCharArray();
        while(start<=end){
            char temp =arr[end];
             arr[end]=arr[start];
            arr[start]=temp;
        start++;
        end--;
        }
    return new String(arr);
    }
}