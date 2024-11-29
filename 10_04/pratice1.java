import java.util.Scanner;

public class pratice1 {
    public static void main(String[] argc){
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入X1:");
        float x1 = scanner.nextInt();
        System.out.println("請輸入Y1:");
        float y1 = scanner.nextInt();
        System.out.println("請輸入X2:");
        float x2 = scanner.nextInt();
        System.out.println("請輸入Y2:");
        float y2 = scanner.nextInt();

        //直線方程式
        double a = (double)(y2 - y1) / (x2 - x1);
        double b = y1 - a * x1;
        System.out.println("直線方程式為: y = " + a + "x + " + b);

        //歐式距離
        double dist1;
        dist1 = Math.sqrt(Math.pow(x2-x1 ,2) + Math.pow(y2-y1 ,2));
        System.out.printf("歐氏距離: %.5f\n", dist1);

        //曼哈頓距離
        double dist2;
        dist2 = Math.abs(x2-x1) + Math.abs(y2-y1);
        System.out.printf("曼哈頓距離: %.2f\n", dist2);

        //minkoski
        System.out.println("請輸入minkoski的P值:");
        int p = scanner.nextInt();
        double dist3;
        dist3 = Math.pow(Math.pow(Math.abs(x2 - x1), p) + Math.pow(Math.abs(y2 - y1), p), 1.0 / p);
        System.out.printf("minkoski: %.5f\n", dist3);

        // 夾角
        double dotProduct = x1 * x2 + y1 * y2;
        double magnitude1 = Math.sqrt(x1 * x1 + y1 * y1);
        double magnitude2 = Math.sqrt(x2 * x2 + y2 * y2);
        double cosTheta = dotProduct / (magnitude1 * magnitude2);

        cosTheta = Math.max(-1.0, Math.min(1.0, cosTheta));
        double degree = Math.toDegrees(Math.acos(cosTheta));
        System.out.printf("兩向量的夾角為: %.2f 度\n", degree);

        scanner.close();
    }
}   