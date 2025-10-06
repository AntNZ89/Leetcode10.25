package problems;

import java.util.Arrays;

public class MaximizeSum {
    public int maximizeSum(int[] nums, int k) {

        Arrays.sort(nums);
        int ret = 0;

        for (int i = 0 ; i < k ; i++){
            ret += nums[nums.length-1];
            nums[nums.length-1]++;
        }

        return ret;

    }
}
