package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Mein3 {
    public static void main(String[] args) {
        String s = "The       quick  brown      fox      jumps over      the lazy dog";
        System.out.println(method2(s));
    }
    static int method1(String s) {
        int res = 0;
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                res++;
            }
        }
        return res;
    }
    static int method2(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && !String.valueOf(s.charAt(i)).equals(" ") && String.valueOf(s.charAt(i + 1)).equals(" ")) {
                res++;
            } else if (i == s.length() - 1 && !String.valueOf(s.charAt(i)).equals(" ")) {
                res++;
            }
        }
        return res;
    }
}
