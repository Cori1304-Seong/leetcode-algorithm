class Solution {
    public String reverseVowels(String s) {
        int leftP  = 0;
        int rightP = s.length() - 1;
        char[] chars = s.toCharArray();

        while (leftP < rightP) {

            while (leftP < rightP && !isVowel(chars[leftP]) ) leftP++;
            
            while (leftP < rightP && !isVowel(chars[rightP])) rightP--;
            
            if (leftP < rightP) {
                    char temp = chars[leftP];
                    chars[leftP] = chars[rightP];
                    chars[rightP] = temp;
                    
                    leftP++;
                    rightP--;
            }

        }
            return new String(chars);

    }

    boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}