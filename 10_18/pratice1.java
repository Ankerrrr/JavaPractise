public class pratice1{
    public static void main (String argc[]){
        int a[] = {2,3,4,5,6,7,22,33,99};

        int min = a[0], max = a[0];
        for(int i = 0 ; i< a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }

        System.out.println("最大值為" + max  + "\n最小值為" + min);
    }
}