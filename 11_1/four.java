import java.util.Scanner;

public class four {
    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        System.out.println("刪除重複字元\n請輸入字串");
        String inputString = sc.next();
        StringBuilder sb = new StringBuilder(inputString);

        int[] asciiTable = new int[126];
        for (int i = 0; i < sb.length(); i++) {
            if (asciiTable[sb.charAt(i)] > 0) {
                sb.delete(i, i + 1);
                i--;
            } else {
                asciiTable[sb.charAt(i)]++;
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}