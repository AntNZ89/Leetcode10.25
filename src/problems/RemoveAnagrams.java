package problems;

import java.util.ArrayList;
import java.util.List;

public class RemoveAnagrams {
    public List<String> removeAnagrams(String[] words) {

        List<String> ans = new ArrayList<>();
        ans.add(words[0]);

        for (int i = 1 ; i < words.length ; i++){
            if (!isAna(words[i], words[i-1])){
                ans.add(words[i]);
            }
        }

        return ans;

    }


    private static boolean isAna(String s1, String s2){

        int[] help = new int[26];

        if (s1.length() != s2.length()){
            return false;
        }

        for (int i = 0 ; i < s1.length() ; i++){
            help[s1.charAt(i)-'a']++;
            help[s2.charAt(i)-'a']--;
        }

        for (int i = 0 ; i < help.length ; i++){
            if (help[i] != 0){
                return false;
            }
        }

        return true;

    }
}
