package problems;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class KthDistinct {
    public String kthDistinct(String[] arr, int k) {

        HashMap<String , Integer> map = new LinkedHashMap<>();

        for (String s : arr){
            if (map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else {
                map.put(s , 1);
            }
        }

        for (String ent : map.keySet()){
            if (map.get(ent) == 1){
                if (k == 1){
                    return ent;
                }
                k--;
            }
        }

        return "";

    }
}
