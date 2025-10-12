package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0 ; i < nums1.length ; i++){
            set1.add(nums1[i]);
        }
        for (int i = 0 ; i < nums2.length ; i++){
            set2.add(nums2[i]);
            if (set1.contains(nums2[i])){
                set1.remove(nums2[i]);
            }
        }

        for (int i = 0 ; i < nums1.length ; i++){
            if (set2.contains(nums1[i])){
                set2.remove(nums1[i]);
            }
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int num : set1){
            list1.add(num);
        }
        for (int num : set2){
            list2.add(num);
        }

        List<List<Integer>> list = new ArrayList<>();

        list.add(list1);
        list.add(list2);

        return list;

    }
}
