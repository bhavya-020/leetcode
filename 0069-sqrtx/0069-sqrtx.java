class Solution {
    public int mySqrt(int x) {
        int i;
        if(x==0)return 0;
        if(x==1){return 1;}
        if(x==2)return 1;
        for( i = 1;i<x;i++){
            if(i*i == x ){
                return i;

            }else if (i*i > x){
                return i-1;
            }
        } 
        return i;
        // return Math.round(i-1);
    }
}