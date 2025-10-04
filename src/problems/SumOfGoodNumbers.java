package problems;

public class SumOfGoodNumbers {
    public int sumOfGoodNumbers(int[] nums, int k) {

        int ans = 0;

        for (int i = 0 ; i < nums.length ; i++){
            if (i-k < 0 && i+k > nums.length-1){
                ans += nums[i];
            }
            else if (i-k < 0 ){
                if (nums[i] > nums[i+k]){
                    ans += nums[i];
                }
            }
            else if (i + k > nums.length-1){
                if (nums[i] > nums[i-k]){
                    ans += nums[i];
                }
            }
            else {
                if (nums[i] > nums[i+k] && nums[i] > nums[i-k]){
                    ans += nums[i];
                }
            }
        }

        return ans;

    }
}
