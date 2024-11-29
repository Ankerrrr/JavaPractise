import java.util.Scanner;

public class wellOrder1 {
    public static void main(String [] argc){
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入數字:");
        int input = sc.nextInt();

        int now = 0;
        int last = 0;
        boolean itIs = true;
        int len = String.valueOf(input).length();
        for(int i = 0; i<len; i++){
            now = String.valueOf(input).charAt(i);//得到的是ascii碼
            now -= 48;
            
            if(now < last){
                itIs = false;
                break;
            }
            last = now;
        }
        if(itIs == true){
            System.out.println("這是");
        }else{
            System.out.println("這不是");
        }

        sc.close();
    }
}
