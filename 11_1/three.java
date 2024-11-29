import java.util.Scanner;

public class three {
    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        System.out.print("轉換數字\n請輸入一字串");
        String inputString = sc.next();
        if (inputString.matches("\\d+")) {
            int itInt = Integer.parseInt(inputString);
            float itFolat = Float.parseFloat(inputString);
            double itDouble = Double.parseDouble(inputString);
            System.out.println(itInt);
            System.out.println(itFolat);
            System.out.println(itDouble);
        } else {
            System.out.println("有非數字");
            System.out.println(inputString);
        }
        sc.close();
    }
}
