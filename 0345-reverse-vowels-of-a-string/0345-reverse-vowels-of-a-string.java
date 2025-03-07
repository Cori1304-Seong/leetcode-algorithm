import java.util.*;


class Solution {
    public String reverseVowels(String s) {
        // char [] chArr = {'a','e','i','o','u','A','E','I','O','U'};
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        List<Integer> integerList = new ArrayList<>();
        List<Character> characterList = new ArrayList<>();
        char[] chArr = s.toCharArray();

        for (int i=0; i < s.length();i++){
            char ch=s.charAt(i);
            if (vowels.contains(ch)){
                integerList.add(i);
                characterList.add(ch);
                // System.out.println(ch);
            }
        }
       int size = characterList.size();
        for (int i = size  - 1; i >= 0; i--){
             Integer integer = integerList.get(i);
             Character charater = characterList.get( size- i -1); 
             chArr[integer] = charater;
            
            // System.out.println(charater);


        }
        return new String(chArr);
    }
}