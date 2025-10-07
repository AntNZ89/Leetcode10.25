package problems;

public class BusyStudent {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int ret = 0;

        for (int i = 0 ; i < endTime.length ; i++){
            if (endTime[i] >= queryTime && startTime[i] <= queryTime){
                ret++;
            }
        }

        return ret;

    }
}
