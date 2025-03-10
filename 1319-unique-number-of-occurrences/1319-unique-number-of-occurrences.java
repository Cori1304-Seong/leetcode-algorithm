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

        HashSet<Integer> valueSet = new HashSet<>(has.values());

        return (valueSet.size() == has.size());

       
    }
}