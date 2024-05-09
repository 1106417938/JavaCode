package leetcode.qs228;

import java.util.ArrayList;
import java.util.List;

public class qs228 {
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};
        for (String s : summaryRanges(nums)) {
            System.out.println(s);
        }
        System.out.println(summaryRanges(nums).size());
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int count = 0;
        int pre = 0;
        int last = 0;
        if (nums.length == 1) {
            list.add(String.valueOf(nums[0]));
            return list;
        }
        pre = nums[0];
        count = 0;
        for (int i = 1; i < nums.length; i++) {
            last = nums[i];
            if (last != nums[i - 1] + 1) {
                count ++;
                if (count == 1) {
                    list.add(String.valueOf(pre));
                    count = 0;
                    pre = last;
                }
                else if (count == 2) {
                    list.add(pre + "->" + nums[i - 1]);
                    pre = last;
                    count = 0;
                }
            } else {
                if (count == 0) {
                    count = 1;
                }
            }
        }
        if (count == 0) {
            list.add(String.valueOf(last));
        }
        if (count == 1) {
            list.add(pre + "->" + last);
        }
        return list;
    }
}
