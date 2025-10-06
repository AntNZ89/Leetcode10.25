package problems;

import java.util.LinkedList;
import java.util.List;

public class StableMountains {
    public List<Integer> stableMountains(int[] height, int threshold) {

        List<Integer> list = new LinkedList<>();

        for (int i = 1 ; i < height.length ; i++){
            if (height[i-1] > threshold){
                list.add(i);
            }
        }

        return list;

    }
}
