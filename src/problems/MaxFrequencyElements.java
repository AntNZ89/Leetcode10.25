package problems;

public class MaxFrequencyElements {
    public int maxFrequencyElements(int[] nums) {

        int[] ans = new int[101];
        int max = 1;

        for (int i = 0 ; i < nums.length ; i++){
            ans[nums[i]]++;
            max = Math.max(max, ans[nums[i]]);
        }

        int ret = 0;

        for (int num : ans){
            if (num == max) ret += max;
        }

        return ret;

    }
}
