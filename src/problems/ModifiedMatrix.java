package problems;

public class ModifiedMatrix {
    public int[][] modifiedMatrix(int[][] matrix) {

        int[][] answer = new int[matrix.length][matrix[0].length];
        int[] max = new int[matrix[0].length];

        for (int c = 0 ; c < matrix.length ; c++){
            for (int r = 0 ; r < matrix[0].length ; r++){
                answer[c][r] = matrix[c][r];
                if (answer[c][r] > max[r]){
                    max[r] = answer[c][r];
                }
            }
        }

        for (int c = 0 ; c < answer.length ; c++){
            for (int r = 0 ; r < matrix[0].length ; r++){
                if (answer[c][r] == -1){
                    answer[c][r] = max[r];
                }
            }
        }

        return answer;

    }
}
