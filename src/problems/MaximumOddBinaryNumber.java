package problems;

public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {

        int count1 = 0;

        for (char ch : s.toCharArray()){
            if (ch == '1'){
                count1++;
            }

        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0 ; i < s.length() ; i++){
            if (i == s.length()-1){
                ans.append('1');
            }
            else if (count1 != 1){
                ans.append("1");
                count1--;

            }
            else {
                ans.append("0");
            }
        }

        return ans.toString();

    }
}
