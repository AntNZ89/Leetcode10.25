package problems;

import java.util.HashMap;

public class NumberOfPairs {
    public int[] numberOfPairs(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0 ; i < nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }

        for (Integer value : map.values()){
            ans[0] += value/2;
            ans[1] += value%2;
        }

        return ans;

    }
}
