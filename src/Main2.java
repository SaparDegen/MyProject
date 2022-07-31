import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        char[] arrCh = new char[10];
        for (int i = 0; i < arrCh.length; i++) {
            arrCh[i] = (char) rnd.nextInt(97,115);
            System.out.print(arrCh[i] + " ");
        }
        System.out.println("\n" + method(arrCh));
    }
    static String method(char[] arr) {
        String res = "";
        for (char a: arr) {
            res = res.concat(String.valueOf(a));
        }
        return res;
    }
}
