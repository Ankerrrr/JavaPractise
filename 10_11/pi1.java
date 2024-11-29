public class pi1 {
    public static void main(String [] argc){
        double PII = 1;
        boolean pm = false;

        for(int i = 3;i<100002;i+=2){
            if(pm){
                PII += (double)1/i;
                pm = false;
            }else{
                PII -= (double)1/i;
                pm = true;
            }
            if( (i % 10000) == 1){
                System.out.println("i=" + i + "= " + PII * 4);
            }
        }     
    }
}
