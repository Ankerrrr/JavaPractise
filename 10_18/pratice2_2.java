import java.util.Scanner;

public class pratice2_2 {
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);

        System.out.print("請決定陣列長度:");
        int len = sc.nextInt();
        int[] a = new int[len];

        System.out.println("請輸入陣列");
        for(int i = 0; i < len; i++){
            System.out.print("第" + i + "個陣列:");
            a[i] = sc.nextInt();
        }

        System.out.println("\n這是你輸入的陣列");
        for(int i = 0; i< a.length; i++){
            System.out.print(a[i]);
            if(i+1 != a.length){
                System.out.print(", ");
            }
        }
        

        //排序 大到小
        int max;
        int[] b = new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length);
        for(int i = 0; i < b.length; i++){
            max = -1;
            for(int j = i+1; j< b.length; j++){
                if(b[j] > max){
                    max = b[j];
                }
            }
            b[i] = max;
        }
        //輸出
        System.out.print("\nmax:");
        for(int i = 0;i<b.length;i++){
            System.out.print(b[i]);
            if(i+1 != b.length){
                System.out.print(", ");
            }
        }

        //排序小到大
        int min;
        int[] c = new int[a.length];
        System.arraycopy(a, 0, c, 0, a.length);
        for(int i = 0; i < b.length; i++){
            min = 99;
            for(int j = i+1; j< b.length; j++){
                if(min > c[j]){
                    min = c[j];
                }
            }
            c[i] = min;
            if(i == b.length-1){
                c[i] = -1;
            }
        }
        //輸出
        System.out.print("\nmin:");
        for(int i = 0;i<c.length;i++){
            System.out.print(c[i]);
            if(i+1 != c.length){
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
