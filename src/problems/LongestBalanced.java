package problems;

public class LongestBalanced {
    public int longestBalanced(String s) {

        int ret = 0;

        for (int i = 0 ; i < s.length() ; i++){
            int[] ans = new int[26];
            for (int j = i ; j < s.length() ; j++){
                ans[s.charAt(j) - 'a']++;
                if (isBalanced(ans)){
                    ret = Math.max(ret, j-i+1);
                }
            }
        }

        return ret;

    }

    public static boolean isBalanced(int[] ans){

        int num = 0;

        for (int i = 0 ; i < ans.length ; i++){
            if (num == 0 && ans[i] != 0){
                num = ans[i];
            }
            else if (ans[i] == 0){
                continue;
            }
            else if (num != ans[i]){
                return false;
            }
        }

        return true;

    }
}
