package problems;

public class IsBoomerang {
    public boolean isBoomerang(int[][] points) {

        double x1 = points[0][0];
        double x2 = points[1][0];
        double x3 = points[2][0];
        double y1 = points[0][1];
        double y2 = points[1][1];
        double y3 = points[2][1];

        if ((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x2 == x3 && y2 == y3)){
            return false;
        }

        if (y1 == y3 && y1 == y2 && y2 == y3){
            return false;
        }

        if (x1 == x3){
            if (x1 == x2){
                return false;
            }
            else {
                return true;
            }
        }

        if (x2 == x3){
            if (x2 == x1){
                return false;
            }
            else {
                return true;
            }
        }

        if (x2 == x1){
            if (x3 == x1){
                return false;
            }
            else {
                return true;
            }
        }

        double m = (y3 - y1) / (x3 - x1);

        if (x2 > x1){
            double dif = x2 - x1;

            if (y2 == (dif * m)+ y1){
                return false;
            }
        }
        else {
            double dif = x1 - x2;

            if (y1 == dif * m + y2){
                return false;
            }
        }

        return true;

    }
}
