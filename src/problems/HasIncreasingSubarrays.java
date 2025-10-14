package problems;

import java.util.ArrayList;
import java.util.List;

public class HasIncreasingSubarrays {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {

        List<Integer> list = new ArrayList<>();

        if (k == 1){
            return true;
        }

        for (int i = 0 ; i <= nums.size()-k ; i++){
            boolean bol = true;
            for (int j = 0 ; j < k-1 ; j++){
                if (nums.get(i+j) >= nums.get(i+j+1)){
                    bol = false;
                }
            }

            if (bol){
                list.add(i);
            }
        }

        for (int num : list){
            if (list.contains(num+k)){
                return true;
            }
        }

        return false;

    }
}
