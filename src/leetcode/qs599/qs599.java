package leetcode.qs599;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class qs599 {
    public static void main(String[] args) {
        String[] str1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] str2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(findRestaurant(str1,str2).length);
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> sameStr = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    sameStr.put(list1[i],i + j);
                }
            }
        }
        String[] result = getResult(sameStr);
        return result;
    }

    private static String[] getResult(Map<String, Integer> sameStr) {
        int minIndex = 2001;
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> map: sameStr.entrySet()) {
            if (minIndex >= map.getValue()) {
                minIndex = map.getValue();
            }
        }
        for (Map.Entry<String, Integer> map: sameStr.entrySet()) {
            if (map.getValue() == minIndex) {
                result.add(map.getKey());
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
