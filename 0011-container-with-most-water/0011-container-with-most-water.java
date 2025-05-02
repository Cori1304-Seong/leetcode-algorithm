/**
height[0]부터 left, hight[height.length -1]부터 right
int maxArea : 현재 가장 큰 값을 저장

while(right - left > 0){
 1. int minHeight: height[left]와 height[right]중 더 작은 값   
 2. int area = minHeight * (right -left ) 
 3. area가 지금까지 나온 값중 가장 큰지 확인 
 4. height[left]와 height[right]중 더 작은 값은 이동 (전 보다 더 작은을 수 있지만, 이전에 값이 더 크다는 것을 증명 가능)

}

  
 */
class Solution {
    public int maxArea(int[] height) {
      int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
    }
