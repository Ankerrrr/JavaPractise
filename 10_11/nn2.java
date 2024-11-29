public class nn2 {
    public static void main(String[] argc){
        for(int i = 2; i<10; i+=2){
            for(int j = 1; j<10; j+=2){
                System.out.print(j + "*" + i + "=" + (i*j) + ", ");
            }
            System.out.println("");
        }
    }
}