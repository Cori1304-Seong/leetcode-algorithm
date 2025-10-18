class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Len = word1.length();
        int word2Len = word2.length();
        int len = word1Len > word2Len ? word1Len : word2Len;
        StringBuilder answer = new StringBuilder();
        int i = 0;

        while( len > i){
            if (i < word1Len ){
                answer.append(word1.charAt(i));
            }

             if (i < word2Len ){
                answer.append(word2.charAt(i));
            }

            i++;
        }



        return answer.toString();
    }
}