class Solution {
    public int countDigits(int num) {
        int ans = 0;
        int temp = num;
        int r;
        while(num!=0){
            r = num%10;
            if(temp % r == 0){
                ans++;
            }
            num = num/10;
        }
        // for(int i = 0; i<nums.length;i++){
        // }
        return ans;
    }
}