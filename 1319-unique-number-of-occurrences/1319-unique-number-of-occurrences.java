class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> has = new HashMap<>( );

        for (int i=0; i < arr.length ; i++){
            int key = arr[i];
            has.put(key, has.getOrDefault(key, 0) + 1);

        }

        HashSet<Integer> valueSet = new HashSet<>(has.values());

        return (valueSet.size() == has.size());
    }
}