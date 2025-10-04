package problems;

import java.util.Arrays;

public class MinimumSum {
    public int minimumSum(int num) {

        int[] ar = new int[4];

        for (int i = 0 ; i < ar.length ; i++){
            ar[i] = num % 10;
            num /= 10;
        }

        Arrays.sort(ar);

        return (ar[0]+ar[1])*10 + ar[2] + ar[3];

    }
}
