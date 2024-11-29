import java.util.Scanner;

public class pratice2D_2AandB {
    public static void printArray(int receive[][]) {
        for (int i = 0; i < receive.length; i++) {
            for (int j = 0; j < receive[i].length; j++) {
                System.out.print(receive[i][j] + ", ");
            }
            System.out.print("\n");
        }
    }

    public static int cacuDet(int receive[][]) {
        if (receive.length == 1) {
            return receive[0][0];
        } else if (receive.length == 2) {
            return (receive[0][0] * receive[1][1]) - (receive[0][1] * receive[1][0]);

        } else if (receive.length == 3) {
            int sum1 = 0, sum2 = 0, total = 1;
            int index = 0, indey = 0;
            for (int j = 0; j < 3; j++) {
                total = 1;
                index = j;
                indey = 0;
                for (int i = 0; i < 3; i++) {
                    total *= receive[index % 3][indey % 3];
                    index++;
                    indey++;
                }
                sum1 += total;
            }
            for (int j = 2; j >= 0; j--) {
                total = 1;
                index = j;
                indey = 0;
                for (int i = 0; i < 3; i++) {
                    total *= receive[index][indey];
                    index = (index - 1) % 3;
                    switch (index) {
                        case -1:
                            index = 2;
                            break;
                        case -2:
                            index = 1;
                            break;
                        case -3:
                            index = 0;
                            break;
                    }
                    indey++;
                }
                sum2 += total;
            }
            return sum1 - sum2;
        } else {
            System.out.println("ERRor");
            return 1;
        }
    }

    public static void showDet(int receive[][]) {
        System.out.println("計算出的行列式為: " + cacuDet(receive));
    }

    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        int size;
        while (true) {
            System.out.print("請輸入陣列大小:");
            size = sc.nextInt();
            if (size <= 4) {
                break;
            } else {
                System.out.println("請輸入小於5的數值!!!");
            }
        }

        int[][] a;
        a = new int[size][size];
        System.out.println("輸入陣列內容");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("輸入第" + (i + 1) + "," + (j + 1) + "的內容:");
                a[i][j] = sc.nextInt();
            }
            System.out.println("___________________");
        }

        printArray(a); // printOut

        int na[][];

        if (size == 1) {
            showDet(a);
            sc.close();
            return;
        } else if (size == 2 || size == 3 || size == 4) {
            na = new int[size - 1][size - 1];
        } else {
            sc.close();
            return;
        }

        int col, row;
        while (true) {
            System.out.print("請輸入你要減去的座標\n行(直):");
            col = sc.nextInt();
            System.out.print("列(橫):");
            row = sc.nextInt();
            if (col > size || row > size || col < 1 || row < 1) {
                System.out.println("請輸入合理的數值!");
            } else {
                break;
            }
        }

        int newCol = 0, newRow = 0;
        for (int i = 0; i < a.length; i++) {
            newCol = 0;
            if (i == row - 1) {
                continue;
            }
            for (int j = 0; j < a[i].length; j++) {
                if (j == col - 1) {
                    continue;
                }
                na[newRow][newCol] = a[i][j];
                newCol++;
            }
            newRow++;
        }

        printArray(na);
        showDet(na);
        sc.close();
    }
}