package problems;

public class MinimumSumOfMountain {
    public int minimumSum(int[] nums) {

        int max = Integer.MAX_VALUE;

        for (int i = 0 ; i < nums.length ; i++){
            for (int j = i+1 ; j < nums.length ; j++){
                for (int k = j+1 ; k < nums.length ; k++){
                    if (nums[i] < nums[j] && nums[k] < nums[j]){
                        if (nums[i]+nums[j]+nums[k] < max){
                            max = nums[i] + nums[k] + nums[j];
                        }
                    }
                }
            }
        }

        if (max == Integer.MAX_VALUE){
            return -1;
        }

        return max;

    }
}
