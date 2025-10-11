package problems;

public class MinOperations {
    public int minOperations(int[] nums) {

        int count = 0;

        for (int i = 0 ; i < nums.length ; i++){
            if (i == 0){
                count = nums[0];
            }
            else {
                if (count != nums[i]){
                    return 1;
                }
            }
        }

        return 0;

    }
}
