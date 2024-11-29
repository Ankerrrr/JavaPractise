import java.util.Scanner;

public class one {
    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入");
        String inputString = sc.next();
        if (checkPalindrome(inputString)) {
            System.out.println("是迴文");
        } else {
            System.out.println("不是迴文");
        }
        sc.close();
    }

    public static boolean checkPalindrome(String a) {
        int length = a.length();
        for (int i = 0; i < length / 2; i++) {
            if (a.charAt(i) == a.charAt((length - 1) - i)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
