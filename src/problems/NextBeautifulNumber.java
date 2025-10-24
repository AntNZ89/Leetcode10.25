package problems;

import java.util.HashMap;

public class NextBeautifulNumber {
    public int nextBeautifulNumber(int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean bol = true;
        boolean ret = true;

        while (bol){

            ret = true;
            n++;
            String s = "" + n;

            for (int i = 0 ; i < s.length() ; i++){
                map.put(s.charAt(i)-'1'+1 , map.getOrDefault(s.charAt(i)-'1'+1 , 0)+1);
            }

            for (int num : map.keySet()){
                if (num != map.get(num)){
                    map.clear();
                    s = "";
                    ret = false;
                    break;
                }
            }

            if (ret){
                return n;
            }

        }

        return 0;

    }
}
