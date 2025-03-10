class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<String, Integer> has = new HashMap<>( );

        for (int i=0; i < arr.length ; i++){
            String str = Integer.toString(arr[i]);
            if (has.containsKey(str)){
                int val = has.get(str);
                has.replace(str, val + 1);
            }else has.put(str, 1);
        }

        String[] keys = has.keySet().toArray(new String[0]);
       List<Integer> occurCounts = new ArrayList<>();

        for (String key: keys){
            int count = has.get(key);

            if (occurCounts.contains(count)) return false;

            occurCounts.add(count);

        }      
 return true;
    }
}