package problems;

public class NumWaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {

        int haveDrunk = 0;
        int emptyBottles = 0;
        int add;
        boolean bol = true;

        while (bol){

            add = 0;

            haveDrunk += numBottles;
            emptyBottles += numBottles;
            numBottles = 0;

            add = emptyBottles / numExchange;
            emptyBottles -= add * numExchange;
            numBottles += add;

            if (numBottles == 0){
                return haveDrunk + numBottles;
            }

        }

        return haveDrunk;

    }
}
