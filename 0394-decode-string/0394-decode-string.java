class Solution {
    public String decodeString(String s) {
      Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int currNum = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currNum = currNum * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(currNum);
                stringStack.push(currStr);
                currStr = new StringBuilder();
                currNum = 0;
            } else if (ch == ']') {
                int repeatCount = countStack.pop();
                StringBuilder decodedStr = new StringBuilder(stringStack.pop());

                for (int i = 0; i < repeatCount; i++) {
                    decodedStr.append(currStr);
                }
                currStr = decodedStr; 
            } else {
                currStr.append(ch);
            }
        }

        return currStr.toString();
    }
}