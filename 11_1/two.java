import java.util.Scanner;

public class two {
    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        System.out.println("字串一:");
        String firstString = sc.nextLine();
        System.out.println("字串二:");
        String secondString = sc.nextLine();
        if (checkAnagrams(firstString, secondString)) {
            System.out.println("是同字母組合的結果");
        } else {
            System.out.println("不是同字母組合的結果");
        }
        sc.close();
    }

    public static boolean checkAnagrams(String a, String b) {
        int[] asciiTable = new int[128];
        a = a.toUpperCase();
        b = b.toUpperCase();
        for (int i = 0; i < a.length(); i++) { // store a string
            if (a.charAt(i) == ' ') {
                continue;
            }
            asciiTable[a.charAt(i)]++;
        }

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) != ' ') {
                if (--asciiTable[b.charAt(i)] < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
