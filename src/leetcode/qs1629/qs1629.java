package leetcode.qs1629;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class qs1629 {
    public static void main(String[] args) {
        int[] time = {12,23,36,46,62};
        String str = "spuda";
        System.out.println(slowestKey(time,str));
    }
    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] preTime = new int[releaseTimes.length];
        int maxTime = 0;
        preTime[0] = 0;
        for (int i = 1; i < preTime.length; i++) {
            preTime[i] = releaseTimes[i - 1];
        }
        int[] instace = new int[releaseTimes.length];
        for (int i = 0; i < preTime.length; i++) {
            instace[i] = releaseTimes[i] - preTime[i];
            if (instace[i] > maxTime) {
                maxTime = instace[i];
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 1; i < preTime.length; i++) {
            if (instace[i] == maxTime) {
                list.add(String.valueOf(keysPressed.charAt(i)));
            }
        }
        list.sort(Comparator.reverseOrder());
        char result = list.get(0).toCharArray()[0];
        return result;
    }
}
