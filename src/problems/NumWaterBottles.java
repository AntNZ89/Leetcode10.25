package problems;

public class NumWaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {

        int haveDrunk = 0;
        int emptyBottles = 0;
        int add = 0;
        boolean bol = true;

        while (bol){

            add = 0;
            haveDrunk += numBottles;
            emptyBottles += numBottles % numExchange;
            numBottles = numBottles/numExchange;
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
