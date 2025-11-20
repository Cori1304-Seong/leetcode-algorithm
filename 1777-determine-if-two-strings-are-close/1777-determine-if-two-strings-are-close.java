import java.util.*;

/** 주어진 동작 2개로 word1이 word2로 바뀔 수 있는지 확인하라
 - word1과 word2의 길이는 같아야 한다. 
 - word1과 word2의 원소의 개수는 같아야 한다. (ex) aabbcc, tnftfn)
 */

class Solution {
    public boolean closeStrings(String word1, String word2) {
        // 길이 비교 (필수 조건)
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
        }

        // 4. 문자 집합 비교 (Operation 2 가능 여부 검증)
        // 두 문자열이 같은 종류의 문자를 포함하는지 확인
        for (int i = 0; i < 26; i++) {

            if ((freq1[i] > 0 && freq2[i] == 0) || (freq1[i] == 0 && freq2[i] > 0)) {
                return false;
            }
        }


        Arrays.sort(freq1);
        Arrays.sort(freq2);

    
        return Arrays.equals(freq1, freq2);
    }
}