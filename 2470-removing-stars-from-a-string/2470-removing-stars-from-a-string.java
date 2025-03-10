class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack();
        StringBuilder answer = new StringBuilder();
       

        for (int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if ( ch != '*'){
                stack.add(ch);
            }
            else if (!stack.isEmpty() && ch =='*') stack.pop();
        }

        while (!stack.isEmpty()) 
         
        {
           Character ch1 = stack.pop();
            System.out.printf("%c", ch1);
            answer.append(ch1);
            }
        
        return answer.reverse().toString();
    }
}