public class pi2 {
    public static void main(String [] argc){
        double PII = 1;
        boolean pm = false;

        for(int i = 3;true;i+=2){
            if(pm){
                PII += (double)1/i;
                pm = false;
            }else{
                PII -= (double)1/i;
                pm = true;
            }
            if( (PII*4 <= (double)3.14160) && (PII*4 >= (double)3.14159)){
                System.out.println("i" + i + "= " + PII * 4);
                break;
            }
        }     
    }
}
