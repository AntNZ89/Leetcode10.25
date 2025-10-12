package problems;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();
        boolean bol = true;

        for (int i = left ; i <= right ; i++){
            String s = "" + i;
            for (int j = 0 ; j < s.length() ; j++){
                if (s.charAt(j)-'1'+1 == 0){
                    bol = false;
                    break;
                }
                else if (i % (s.charAt(j)-'1'+1) != 0){
                    bol = false;
                    break;
                }
            }
            if (bol){
                list.add(i);
            }
            bol = true;
            s = "";
        }

        return list;

    }
}
