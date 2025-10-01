package problems;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;
        boolean bol = true;

        while (bol){

            int m = (l+r)/2;

            if (target > nums[nums.length-1]){
                return nums.length;
            }
            else if (target < nums[0]){
                return 0;
            }
            else if (l+1 == r && nums[m] != target){
                return m+1;
            }

            if (nums[m] == target){
                return m;
            }
            else if (target > nums[m]){
                l = m;
            }
            else if (target < nums[m]){
                r = m;
            }

        }

        return -1;

    }
}
