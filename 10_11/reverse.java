import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("請輸入你要相反的數字 (輸入 'E' 或 'e' 退出)");

            String input = sc.next();
            String ans = "";
            boolean exit = false;

            if(input.equalsIgnoreCase("E")) {
                break;
            }

            for (int i = input.length() - 1; i >= 0; i--) {
                char ch = input.charAt(i);

                if(ch < '0' || ch > '9') {
                    exit = true;
                    break;
                }
                ans += ch;
            }

            if(exit) {
                System.out.println("請輸入有效的數字！");
                continue;
            }

            int ansn = Integer.valueOf(ans);
            System.out.println(ansn);
        }
        sc.close();
    }
}
