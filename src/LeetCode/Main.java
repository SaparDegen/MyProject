package LeetCode;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "aacabdkacaa";
        System.out.println(longestPalindrome(s));
    }
    static String longestPalindrome(String s) {
        int max = 0, max1 = 0;
        String sbstr = "";
        String sbstr1 = "";
        for (int i = 0; i < s.length(); i++) {
            String a = String.valueOf(s.charAt(i));
            for (int j = s.length() - 1; j >= i; j--) {
                String b = String.valueOf(s.charAt(j));
                if (a.equals(b)) {

                    max1 = j - i + 1;
                    sbstr1 = s.substring(i,j + 1);
                    break;
                }
            }
            if (max1 > max) {
                max = max1;
                sbstr = sbstr1;
            }
        }
        return sbstr;
    }
}