import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        char[] arrInt = new char[20];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (char) rnd.nextInt(97,115);
        }
        System.out.println(Arrays.toString(arrInt));
    }
}