class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> has = new HashMap<>( );

        for (int i=0; i < arr.length ; i++){
            int key = arr[i];
            if (has.containsKey(key)){
                int val = has.get(key);
                has.replace(key, val + 1);
            }else has.put(key, 1);
        }

        HashSet<Integer> valueSet = new HashSet<>(has.values());

        return (valueSet.size() == has.size());
    }
}