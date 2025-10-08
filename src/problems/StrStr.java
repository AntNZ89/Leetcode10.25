package problems;

public class StrStr {
    public int strStr(String haystack, String needle) {

        StringBuilder ans = new StringBuilder();
        int temp = 0;

        for (int i = 0 ; i < haystack.length()-needle.length()+1 ; i++){
            for (int j = 0 ; j < needle.length() ; j++){
                if (haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
                else if (j == 0){
                    temp = i+j;
                }
                ans.append(haystack.charAt(i+j));
            }
            if (ans.toString().equals(needle)){
                return temp;
            }
            ans.setLength(0);
        }

        return -1;

    }
}
