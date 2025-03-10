class Solution {
    public String removeStars(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        StringBuilder answer = new StringBuilder();
       

        for (int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if ( ch != '*'){
                deque.addLast(ch);
            }
            else if (!deque.isEmpty() && ch =='*') deque.removeLast();
        }

        while (!deque.isEmpty()) 
        {
           Character ch1 = deque.removeFirst();
            answer.append(ch1);
            }
        

        return answer.toString();
    }
}