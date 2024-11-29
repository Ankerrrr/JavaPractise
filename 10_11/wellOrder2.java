public class wellOrder2 {
    public static void main(String [] argc){
        // Scanner sc = new Scanner(System.in);

        // System.out.print("請輸入數字:");
        // int input = sc.nextInt();
        int count = 0;
        for(int j = 0 ; j< 10000; j++){
            int now = 0;
            int last = 0;
            boolean itIs = true;
            int len = String.valueOf(j).length();
            for(int i = 0; i<len; i++){
                now = String.valueOf(j).charAt(i);//得到的是ascii碼
                now -= 48;
                
                if(now < last){
                    itIs = false;
                    break;
                }
                last = now;
            }
            if(itIs == true){
                // System.out.println("這是");
                count++;
            }else{
                // System.out.println("這不是");
            }
           
        }
        System.out.println("計算結果為" + count);
        
        // sc.close();
    }
}
