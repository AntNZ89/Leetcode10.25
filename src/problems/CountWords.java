package problems;

import java.util.HashMap;
import java.util.HashSet;

public class CountWords {
    public int countWords(String[] words1, String[] words2) {

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashSet<String> forbidden = new HashSet<>();

        for (int i = 0 ; i < words1.length ; i++){
            if (map1.containsKey(words1[i])){
                map1.remove(words1[i]);
                forbidden.add(words1[i]);
            }
            else if (!forbidden.contains(words1[i])){
                map1.put(words1[i] , 1);
            }
        }

        for (int i = 0 ; i < words2.length ; i++){
            if (map2.containsKey(words2[i])){
                map2.remove(words2[i]);
                forbidden.add(words2[i]);
            }
            else if (!forbidden.contains(words2[i])){
                map2.put(words2[i] , 1);
            }
        }

        int count = 0;

        for (String ent : map1.keySet()){
            if (map2.containsKey(ent)){
                count++;
            }
        }

        return count;

    }
}
