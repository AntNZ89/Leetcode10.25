package problems;

public class MaxArea {
    public int maxArea(int[] height) {

        int ret = 0;
        int l = 0;
        int r = height.length-1;

        if (height.length == 2){
            return Math.min(height[l], height[r]);
        }

        while (l+1 != r){

            if (ret < Math.min(height[l], height[r]) * (r-l)){
                ret = Math.min(height[l], height[r]) * (r-l);
            }

            if (height[r] > height[l]){
                l++;
            }
            else {
                r--;
            }
        }

        if (ret < Math.min(height[l], height[r]) * (r-l)){
            ret = Math.min(height[l], height[r]) * (r-l);
        }

        return ret;

    }
}
