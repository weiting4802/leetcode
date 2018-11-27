Add Binary


https://leetcode.com/explore/learn/card/array-and-string/203/introduction-to-string/1160/

class Solution {
   public static String addBinary(String a, String b) {
        int deltaLen = Math.abs(a.length() - b.length());
        int perenos = 0;
        String result = "";

        for (int i = 0; i < deltaLen; i++) {
            if (a.length() > b.length()) b = "0" + b;
            else a = "0" + a;
        }
        
       System.out.print(a + " " + b);
        for (int i = a.length() - 1; i >= 0; i--) {
            perenos = a.charAt(i) == '1' ? perenos + 1 : perenos;
            perenos = b.charAt(i) == '1' ? perenos + 1 : perenos;
            switch (perenos) {
                case 0:
                    result = "0" + result;
                    perenos = 0;
                    break;
                case 1:
                    result = "1" + result;
                    perenos = 0;
                    break;
                case 2:
                    result = "0" + result;
                    perenos = 1;
                    break;
                case 3:
                    result = "1" + result;
                    perenos = 1;
                    break;
            }
        }
        return perenos == 1 ? "1" + result : result;
    }
    
}