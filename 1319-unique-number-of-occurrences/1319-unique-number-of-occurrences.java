import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap();
        Set<Integer> set1 = new HashSet();


        for (int n: arr){
           map.put(n, map.getOrDefault(n, 0) + 1); 
        }

        for(Integer key: map.keySet()){
           Integer val = map.get(key);
           if (set1.contains(val)) return false;
            
            set1.add(val);
        }

        return true;
    }
}