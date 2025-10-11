package problems;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0 ; i < nums.length ; i++){
            ans[i] = i+1;
        }

        for (int i = 0 ; i < nums.length ; i++){
            ans[nums[i]-1] = 0;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0 ; i < nums.length ; i++){
            if (ans[i] != 0){
                list.add(ans[i]);
            }
        }

        return list;

    }
}
