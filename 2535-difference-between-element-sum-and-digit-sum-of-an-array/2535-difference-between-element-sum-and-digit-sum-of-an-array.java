
import java.util.*;
class Solution {
    public int differenceOfSum(int[] nums) {
        int sd = 0;
        int s = 0;
        int r;

        for(int i = 0;i<nums.length;i++){
            s = s+ nums[i] ;

            while(nums[i] >0){
                r = nums[i] %10;
                sd = sd + r;
                nums[i] = nums[i]/10;
            }
        }
        return s-sd;
    }
}