class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {


        for (int i=0; i < flowerbed.length ; i++) {
            if (flowerbed[i] == 0){
                boolean frontEmpty = false;
                boolean backEmpty = false;

                if (i == 0 || flowerbed[i-1] == 0 ) frontEmpty = true; 
                if (i == flowerbed.length -1 || 
                    flowerbed[i+1] == 0 ) backEmpty = true; 
                if (frontEmpty && backEmpty){
                    flowerbed[i] = 1;
                    n--;
                } 

            }


        }
        
        return n > 0 ? false : true;
    }
}