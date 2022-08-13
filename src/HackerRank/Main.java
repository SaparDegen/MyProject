package HackerRank;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] arr1 = {"1 1 1 0 0 0", "0 1 0 0 0 0", "1 1 1 0 0 0", "0 0 2 4 4 0", "0 0 0 2 0 0", "0 0 1 2 4 0"};
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = arr1[i].split(" ");
            List<Integer> arrRowItems = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }
        maxSum(arr);
    }
    static void maxSum(List arr) {
        int max = 0, sum;
        for (int i = 0; i < 4; i++) {
            List list1 = (List) arr.get(i);
            List list2 = (List) arr.get(i + 1);
            List list3 = (List) arr.get(i + 2);
            for (int j = 0; j < 4; j++) {
                int s1 = 0, s2 = 0, s3 = 0;
                for (int k = 0; k < 3; k++) {
                    s1 += (int) list1.get(j + k);
                    s2 = (int) list2.get(j + 1);
                    s3 += (int) list3.get(j + k);
                }
                sum = s1 + s2 + s3;
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
