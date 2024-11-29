import java.util.Scanner;

public class pratice2{
    public static double caculat (double x,double y,double a,double b,double c){
        return (Math.abs(a*x + b*y + c))/(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
    }

    public static void main (String[] argc){
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入A:");
        int a = scanner.nextInt();
        System.out.println("請輸入B:");
        int b = scanner.nextInt();
        System.out.println("請輸入C:");
        int c = scanner.nextInt();
        System.out.println("請輸入X1:");
        int x = scanner.nextInt();
        System.out.println("請輸入Y1:");
        int y = scanner.nextInt();

        System.out.println("距離為:");
        System.out.printf("%.5f",caculat(x,y,a,b,c));
        scanner.close();
    }
}