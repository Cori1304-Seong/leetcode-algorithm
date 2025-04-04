class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        StringBuilder strBu = new StringBuilder();

        for (int i= strArr.length -1; i >= 0; i--){
             if (strArr[i].length() == 0  )
                continue;
        //    System.out.println("a" +strArr[i] +"a");
           
           
            if (i != strArr.length -1) strBu.append(" ");
            strBu.append(strArr[i]);
            
        }




        return strBu.toString();        
    }
}