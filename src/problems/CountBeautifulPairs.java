package problems;

public class CountBeautifulPairs {
    public int countBeautifulPairs(int[] nums) {

        int ret = 0;

        for (int i = 0 ; i < nums.length ; i++){
            String num1 = "" + nums[i];
            int numI = num1.charAt(0)-48;

            for (int j = i+1 ; j < nums.length ; j++){
                String num2 = "" + nums[j];
                int numJ = num2.charAt(num2.length()-1)-48;

                if (gcd(numI , numJ) == 1){
                    ret++;
                }
                num2 = "";
            }
            num1 = "";
        }

        return ret;

    }

    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
}
