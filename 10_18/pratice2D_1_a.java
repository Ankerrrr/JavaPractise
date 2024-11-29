import java.util.Scanner;

public class pratice2D_1_a{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入你要的高度:");
        int n = sc.nextInt();

        char[][] a = new char[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j < i+1; j++){
                a[i][j] = '*';
            }
        }

        System.out.println("下三角形");
        for(int i = 0; i< n; i++){
            for(int j = 0; j<a[i].length; j++){
                System.out.print(a[i][j]);
            }
            System.out.print("\n");
        }


        for(int i = 0; i<n; i++){
            for(int j = 0; j < i+1; j++){
                a[i][j] = ' ';
            }
            for(int j = i; j < n; j++){
                a[i][j] = '*';
            }
        }

        System.out.println("上三角形");
        for(int i = 0; i< n; i++){
            for(int j = 0; j<a[i].length; j++){
                System.out.print(a[i][j]);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}