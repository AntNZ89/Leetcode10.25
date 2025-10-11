package problems;

public class LongestSubArray {
    public int longestSubarray(int[] nums) {

        int count = 0;
        int max = 0;

        if (nums.length == 1){
            return 1;
        }
        else if (nums.length == 2){
            return 2;
        }

        for (int i = 0 ; i < nums.length-2 ; i++){
            if (nums[i] + nums[i+1] == nums[i+2]){
                count++;
            }
            else {
                if (count > max){
                    max = count;
                }
                count = 0;
            }

            if (i == nums.length-3){
                if (count > max){
                    max = count;
                }
            }
        }

        return max+2;

    }
}
