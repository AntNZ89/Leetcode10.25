package problems;

import java.util.HashMap;

public class LongestPalindrome {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0 ; i < s.length() ; i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) , map.get(s.charAt(i)) + 1);
            }
            else {
                map.put(s.charAt(i) , 1);
            }
        }

        int total = 0;
        boolean isOdd = false;

        for (char ch : map.keySet()){
            if (map.get(ch) % 2 == 0){
                total += map.get(ch);
            }
            else {
                total += map.get(ch)-1;
                isOdd = true;
            }
        }

        if (isOdd){
            total++;
        }


        return total;

    }
}
