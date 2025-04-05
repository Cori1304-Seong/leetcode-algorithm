class Solution {
    public String removeStars(String s) {
        Stack<String> stack = new Stack();
        StringBuilder strBu = new StringBuilder();
        String[] strArr = s.split("");

        for (int i = 0 ; i < strArr.length ; i++){
            // System.out.printf("%s", str);
            if (strArr[i].equals("*")){
                int len = strBu.length();
                // if (!stack.isEmpty()) stack.pop();
                if (len-1 >= 0  ) strBu.delete(len-1,len);
                continue;
            }


           strBu.append(strArr[i]);
        }

        // System.out.println();

        // for(String str: stack)  {
        //     System.out.printf("%s", str);

        //     strBu.append(str);
        // }

        

        return strBu.toString();

        
    }
}