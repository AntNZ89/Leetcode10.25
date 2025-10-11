package problems;

public class ScoreBalance {
    public boolean scoreBalance(String s) {

        int totalScore = 0;
        int curr = 0;

        if (s.length() == 2){
            if (s.charAt(0) == s.charAt(1)){
                return true;
            }
            else {
                return false;
            }
        }

        for (int i = 0 ; i < s.length() ; i++){
            totalScore += s.charAt(i) - 'a' + 1;
        }


        for (int i = 0 ; i < s.length()-1 ; i++){
            curr += s.charAt(i) - 'a' + 1;
            if (curr == totalScore-curr){
                return true;
            }
        }

        return false;

    }
}
