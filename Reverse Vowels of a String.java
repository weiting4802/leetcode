

Reverse Vowels of a String

class Solution {
    
    private final static Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public String reverseVowels(String s) {
        int i =0, j=s.length()-1;
        char[] result = s.toCharArray();
        while(i<j){
            if(vowels.contains(result[i]) && vowels.contains(result[j])){
                char temp = result[i];
                result[i] = result[j];
                result[j] = temp;
                i++;
                j--;
            }
            if(!vowels.contains(result[i]) ) i++;
            if(!vowels.contains(result[j])) j--; 
        }
        
        return new String(result);
    }
}