package problems;

import java.util.List;

public class MaxIncreasingSubarrays {
    public int maxIncreasingSubarrays(List<Integer> nums) {

        if (nums.size() == 2){
            return 1;
        }

        int[] arr = new int[nums.size()];
        arr[nums.size()-1] = 1;
        int wrath = 0;

        for (int i = 0 ; i < nums.size() ; i++){
            arr[i] = 1;
        }

        for (int i = 0 ; i < nums.size() ; i++){
            if (wrath != 0){
                arr[i] = wrath;
                wrath--;
                continue;
            }

            for (int j = i ; j < nums.size()-1 ; j++){
                if (nums.get(j) < nums.get(j+1) ){
                    arr[i]++;
                    wrath++;
                }
                else {
                    break;
                }
            }
        }

        int k = 1;

        for (int i = 0 ; i < arr.length ; i++){
            int n = 1;
            if (i + arr[i] == arr.length){
                n = arr[i + arr[i]-1];
            }
            else {
                n = arr[i + arr[i]];
            }
            int num = Math.min(arr[i] , n);
            k = Math.max(k , num);
            k = Math.max(arr[i]/2 , k);
        }

        return k;

    }
}
