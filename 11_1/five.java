import java.util.Scanner;

public class five {
    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        System.out.print("計算重複次數\nmainString:");
        String mainString = sc.next();
        System.out.print("String:");
        String secondString = sc.next();

        int[] asciiTable = new int[126];
        for (int i = 0; i < mainString.length(); i++) {
            asciiTable[mainString.charAt(i)]++;
        }
        int counter = 0;
        for (int i = 0; i < secondString.length(); i++) {
            if (asciiTable[secondString.charAt(i)] > 0) {
                counter++;
            }
        }
        System.out.println("共重複了" + counter + "次");
        sc.close();
    }
}
