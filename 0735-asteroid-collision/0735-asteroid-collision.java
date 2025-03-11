class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();
       
        for (int ast:asteroids){            
            boolean flag = true;
          
            while(!stack.isEmpty()  && stack.peek() > 0 && ast < 0 ){
                int lastData = stack.peek();
                int sum = lastData + ast;
                  
                //   if (sum > 0) flag = false;
                  if (sum < 0 ){
                    stack.pop();
                    continue;
                  }
                  else if (sum == 0){
                    stack.pop();
                    flag = false;
                  }

                  flag = false;
                  break;
                }
            
            if (flag) stack.push(ast);
        }
        
        List<Integer> list = new ArrayList();
        while(!stack.isEmpty()){

            int num= stack.pop();
            list.add(num);
        }
        Collections.reverse(list);
        
        int[] array = list.stream().mapToInt(i -> i).toArray();
        return array;
        
    }
}