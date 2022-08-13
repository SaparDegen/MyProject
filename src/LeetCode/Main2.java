package LeetCode;

import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        String s = "ABCDEFG";
        int numRows = 3;
        convert(s, numRows);
    }
    static void convert(String s, int numRows) {
        char [] arrStr = s.toCharArray();
        int[] arrInt = new int[arrStr.length];
        int b = 0, k = 0;
        String res = "";
        if (numRows != 1) {
            for (int i = 0; i < arrInt.length; i++) {
                if (b == 0) {
                    k++;
                    if (k == numRows) {
                        b = 1;
                    }
                } else if (b == 1) {
                    k--;
                    if (k == 1) {
                        b = 0;
                    }
                }
                arrInt[i] = k;
            }
            for (int i = 1; i <= numRows; i++) {
                for (int j = 0; j < arrInt.length; j++) {
                    if (arrInt[j] == i) {
                        res += arrStr[j];
                    }
                }
            }
        } else {
            res = s;
        }
        System.out.println(res);
    }
}
