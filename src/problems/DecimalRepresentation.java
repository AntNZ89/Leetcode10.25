package problems;

public class DecimalRepresentation {
    public int[] decimalRepresentation(int n) {

        String s = "" + n;
        int[] ret = new int[s.length()];
        int zeroCount = 0;

        int fak = 1;

        for (int i = ret.length-1 ; i >= 0 ; i--){
            int num = s.charAt(i)-0-48;

            if (num == 0){
                zeroCount++;
            }

            ret[i] = (num) * fak;
            fak *= 10;
        }

        int[] ans = new int[ret.length-zeroCount];

        int j = 0;

        for (int i = 0 ; i < ret.length ; i++){
            if (ret[i] != 0){
                ans[j] = ret[i];
                j++;
            }
        }

        return ans;

    }
}
