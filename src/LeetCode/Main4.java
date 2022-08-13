package LeetCode;

public class Main4 {
    public static void main(String[] args) {
        String s = "    +0a32";
        System.out.println(myAtoi(s));
    }
    static int myAtoi(String s) {
        String resStr = "";
        int resInt = 0;
        s = s.trim();
        if (s.length() > 1 && s.length() <= 200) {
            char[] arrChar = s.trim().toCharArray();
            if (((arrChar[0] == '-' || arrChar[0] == '+') && (arrChar[1] >= '0' && arrChar[1] <= '9')) || (arrChar[0] >= '0' && arrChar[0] <= '9')) {
                int zero = 0;
                //int znak = 0;
                for (int i = 0; i < arrChar.length; i++) {
                    if ((i == 0 && (arrChar[0] == '-' || arrChar[0] == '+')) || (arrChar[i] >= '0' && arrChar[i] <= '9')) {
                        if (arrChar[i] >= '1' && arrChar[i] <= '9') {
                            zero = 1;
                        }
/*                        if (zero == 0 && arrChar[i] == '+' && arrChar[i] == '-') {
                            znak = 1;
                        }*/
                        if (arrChar[i] == '0' && zero == 0) {
                        } else {
                            resStr += arrChar[i];
                        }
                    } else {
                        break;
                    }
                }
                if (resStr == "" || resStr.equals("+") || resStr.equals("-")) {
                    resStr = "0";
                } else if (resStr.length() > 11) {
                    resStr = resStr.substring(0, 11);
                }
                if (Long.parseLong(resStr) < -Math.pow(2, 31)) {
                    resInt = (int) -Math.pow(2, 31);
                } else if (Long.parseLong(resStr) > Math.pow(2, 31) - 1) {
                    resInt = (int) Math.pow(2, 31);
                } else {
                    resInt = Integer.parseInt(resStr);
                }
            } else {
                resStr = "0";
            }
        } else if (s.length() == 1 && Character.isDigit(s.charAt(0))) {
            resInt = Integer.parseInt(s);
        }
        return resInt;
    }
}

