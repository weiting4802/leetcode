

Valid Palindrome

class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length()==1) return true;
        
        String temp = s.toLowerCase();
        int i = 0, j =temp.length()-1;
        
        while(i<j){
            
           if(!(temp.charAt(i) <= 122 && temp.charAt(i) >=97) && !(temp.charAt(i) <= 57 && temp.charAt(i) >=48)){
               i++;
               continue;
           }
            
          
            
            if(!(temp.charAt(j) <= 122 && temp.charAt(j) >=97) && !(temp.charAt(j) <= 57 && temp.charAt(j) >=48))               {
                j--;
                continue;
            }
            
          
            if(temp.charAt(i) != temp.charAt(j)){
                System.out.print(temp.charAt(i) + " " + temp.charAt(j));
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

class Solution {
     public static boolean isPalindrome(String s) {

        if (s.length() == 0)
            return true;

        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            char cStart = s.charAt(start);
            char cEnd = s.charAt(end);

            if (!isAlphanumeric(cStart)) {
                start++;
                continue;
            }

            if (!isAlphanumeric(cEnd)) {
                end--;
                continue;
            }

            cStart = toLowerCase(cStart);
            cEnd = toLowerCase(cEnd);

            if (cStart != cEnd)
                return false;


            start++;
            end--;
        }

        return true;

    }

    public static boolean isAlphanumeric(char c) {
        return (c <= 'Z' && c >= 'A') || (c <= 'z' && c >= 'a') ||(c>='0'&&c<='9');
    }

    public static char toLowerCase(char c) {
        if (c <= 'Z' && c >= 'A')
            return (char) (c + 32);

        return c;
    }

}