import java.util.Scanner;

public class twoDSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = inp(sc);
        sort(a);
        sc.close();
    }

    public static int[][] inp(Scanner sc) {
        System.out.print("請輸入幾個數列:");
        int size = sc.nextInt();
        sc.nextLine();

        int a[][] = new int[size][2];

        System.out.println("開始輸入(使用空格隔開)");
        for (int i = 0; i < size; i++) {
            String line = sc.nextLine();
            String[] part = line.split(" ");
            a[i][0] = Integer.parseInt(part[0]);
            a[i][1] = Integer.parseInt(part[1]);
        }

        return a;
    }

    public static void sort(int[][] a) {
        int len = a.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (a[j][0] > a[j + 1][0] || (a[j][0] == a[j + 1][0] && a[j][1] > a[j + 1][1])) {
                    int[] temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        printOut(a);
    }

    public static void printOut(int[][] a) {
        System.out.println("-----------------------");
        int len = a.length;
        for (int i = 0; i < len; i++) {
            System.out.println(a[i][0] + " " + a[i][1]);
        }
    }
}
