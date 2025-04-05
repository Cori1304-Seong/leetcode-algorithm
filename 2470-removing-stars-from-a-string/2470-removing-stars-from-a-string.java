class Solution {
    public String removeStars(String s) {
        Stack<String> stack = new Stack();
        StringBuilder strBu = new StringBuilder();
        String[] strArr = s.split("");

        for (String str: strArr){
            if (str.equals("*")){
                if (!stack.isEmpty()) stack.pop();
                continue;
            }


            stack.add(str);
        }

        for(String str: stack){
            strBu.append(str);
        }

        

        return strBu.toString();

        
    }
}