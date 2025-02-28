class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;
        char[]arr = s.toCharArray();

        for (int i=0;i < t.length(); i++){            
            char ch1= t.charAt(i);
            
            if (idx == s.length()) break;
            
            if(arr.length > 0 &&arr[idx]== ch1 ) idx++;
        }

        return idx == s.length()? true: false;
    }
}