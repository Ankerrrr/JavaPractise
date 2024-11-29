import java.util.Scanner;

public class pratice3{
    public static void main (String[] argc){
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[3];
        for(int i = 1; i<4; i++){
            System.out.println("請輸入第"+ i +"個數值(共三個)");
            x[i-1] = scanner.nextInt();
        }

        int biggest = 
        (x[0] > x[1]) ? (x[0] > x[2])? x[0] : x[2] : (x[1] > x[2]) ? x[1] : x[2];
        System.out.println("最大值為:" + biggest);

        int smallest = 
        (x[0] < x[1]) ? (x[0] < x[2])? x[0] : x[2] : (x[1] > x[2]) ? x[1] : x[2];
        System.out.println("最小值為:" + smallest);

        int middle = 
        (x[0] != biggest && x[0] != smallest) ? x[0] : (x[1] != biggest && x[1] != smallest) ? x[1] : x[2];
        System.out.println("中間值為:" + middle);
        scanner.close();
    }
}