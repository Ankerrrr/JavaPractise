import java.util.Scanner;
public class pratice2_1 {
    public static void main ( String[] argc){
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

        int temp = 0 , index = 0;
        for(int i = 0; i<a.length; i++){
            index = i;
            for(int j = i; j<a.length; j++){
                if(a[i] < a[j]){
                    index = j;
                }
            }
            temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }

        System.out.println("\n經過大至小排列後");
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]);
            if(i+1 != a.length){
                System.out.print(", ");
            }
        }
        
        sc.close();
    }
}
