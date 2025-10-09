package problems;

import java.util.ArrayList;
import java.util.List;

public class SeparateDigits {
    public int[] separateDigits(int[] nums) {

        List<Integer> list = new ArrayList<>();
        String s = "";

        for (int i = 0 ; i < nums.length ; i++){
            s = "" + nums[i];
            for (int j = 0 ; j < s.length() ; j++){
                list.add(s.charAt(j)-48);
            }
            s = "";
        }

        int[] ret = new int[list.size()];

        for (int i = 0 ; i < list.size() ; i++){
            ret[i] = list.get(i);
        }

        return ret;

    }
}
