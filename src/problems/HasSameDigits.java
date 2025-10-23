package problems;

public class HasSameDigits {
    public boolean hasSameDigits(String s) {

        String ans = s;
        String temp = "";

        while (ans.length() != 2){
            for (int i = 0 ; i < ans.length()-1 ; i++){
                temp += "" + (ans.charAt(i+1)-'1'+1 + ans.charAt(i)-'1'+1) % 10;
            }
            ans = temp;
            temp = "";
        }

        if (ans.charAt(0) == ans.charAt(1)){
            return true;
        }

        return false;

    }
}
