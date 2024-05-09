package leetcode.qs506;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Comparator.*;

public class qs506 {
    public static String[] findRelativeRanks(int[] score) {
        int[] rank = Arrays.copyOf(score,score.length);
        String[] result = new String[score.length];
        Arrays.sort(rank);
        reverse(rank);
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (rank[i] == score[j]) {
                    if (i == 0) {
                        result[j] = "Gold Medal";
                        break;
                    }
                    else if (i == 1) {
                        result[j] = "Silver Medal";
                        break;
                    }
                    else if (i == 2) {
                        result[j] = "Bronze Medal";
                        break;
                    } else {
                        result[j] = String.valueOf(i+1);
                        break;
                    }
                }
            }
        }
        return result;
    }

    private static void reverse(int[] rank) {
        for (int i = 0; i < rank.length / 2; i++) {
            int temp = 0;
            temp = rank[rank.length - i - 1];
            rank[rank.length - i - 1] = rank[i];
            rank[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] score = {5,4,3,2,1};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
}
