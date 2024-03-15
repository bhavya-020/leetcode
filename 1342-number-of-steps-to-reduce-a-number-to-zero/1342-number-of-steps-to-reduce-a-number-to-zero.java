class Solution {
    public int numberOfSteps(int num) {
        int ans = 0;
        if (num == 0)
            return ans;

        // for(int i = 0;i<num;i++){
        if (num % 2 == 0) {
             ans+=  numberOfSteps(num / 2);
            ans++;

        } else {
             ans+=  numberOfSteps(num -1);
            ans++;
        }
        return ans;

    }
    // }
}