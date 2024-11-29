public class rotation{
    public static void main(String[] argc) throws Exception{
        String[] rotationC = {"|","/","一","\\"};
        int i = 0;
        while(true){
            System.out.print("\r" + rotationC[i]);
            Thread.sleep(300);
            i++;
            if(i>3){
                i = 0;
            }
        }
        
    }
}