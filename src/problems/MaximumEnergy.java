package problems;

public class MaximumEnergy {
    public int maximumEnergy(int[] energy, int k) {

        int ret = 0;
        int dp[] = new int[energy.length];

        for (int i = energy.length-1 ; i >= 0 ; i--){
            dp[i] = energy[i];
            if (i+k < energy.length){
                dp[i] += dp[i+k];
            }

            if (i == energy.length-1){
                ret = dp[i];
            }
            else if (dp[i] > ret){
                ret = dp[i];
            }

        }

        return ret;

    }
}
