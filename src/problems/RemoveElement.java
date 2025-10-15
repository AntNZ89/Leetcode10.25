package problems;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int ret = 0;

        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] == val){
                ret++;
            }
        }

        int[] ans = new int[nums.length-ret];
        int j = 0;

        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }

        return nums.length-ret;

    }
}
