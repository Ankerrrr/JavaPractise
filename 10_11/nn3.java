public class nn3 {
    public static void main(String[] argc){
        for(int i = 1; i<10; i+=2){
            for(int j = 2; j<10; j+=2){
                System.out.print(j + "*" + i + "=" + (i*j) + ", ");
            }
            System.out.println("");
        }
    }
}