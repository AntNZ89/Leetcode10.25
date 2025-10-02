package problems;

public class MaxBottlesDrunk {
    public int maxBottlesDrunk(int numBottles, int numExchange) {

        int haveDrunk = 0;
        int emptyBottles = 0;
        int add = 0;
        boolean bol = true;

        while (bol){

            haveDrunk += numBottles;
            emptyBottles += numBottles;
            numBottles = 0;

            while (emptyBottles >= numExchange){
                add++;
                emptyBottles -= numExchange;
                numExchange++;
            }

            numBottles += add;

            if (numBottles == 0){
                return haveDrunk + numBottles;
            }

            add = 0;

        }

        return haveDrunk;

    }
}
