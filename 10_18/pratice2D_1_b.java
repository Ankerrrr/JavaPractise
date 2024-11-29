import java.util.Scanner;

public class pratice2D_1_b{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入你要尋找的值:");
        int lookFor = sc.nextInt();


        //init 三角形
        int[][] a;
        a = new int[10000][];

        int num = 1;
        for(int i = 0; i<10000; i++){
            a[i] = new int[i+1];
            for(int j = 0; j<i+1; j++){
                a[i][j] = num;
                if(num == lookFor){
                    System.out.println("找到" + lookFor +"出現在" + i +", " + j);
                }
                num++;
            }
        }

        sc.close();
    }
}