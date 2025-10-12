package problems;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {

        int perimeter = 0;

        for (int c = 0 ; c < grid.length ; c++){
            for (int r = 0 ; r < grid[0].length ; r++){

                if (grid[c][r] == 0){
                    continue;
                }

                if (c == 0){
                    perimeter++;
                }
                if (c == grid.length-1){
                    perimeter++;
                }
                if (r == 0){
                    perimeter++;
                }
                if (r == grid[0].length-1){
                    perimeter++;
                }

                if (c+1 < grid.length){
                    if (grid[c+1][r] == 0){
                        perimeter++;
                    }
                }
                if (c-1 >= 0){
                    if (grid[c-1][r] == 0){
                        perimeter++;
                    }
                }
                if (r+1 < grid[0].length){
                    if (grid[c][r+1] == 0){
                        perimeter++;
                    }
                }
                if (r-1 >= 0){
                    if (grid[c][r-1] == 0){
                        perimeter++;
                    }
                }

            }
        }

        return perimeter;

    }
}
