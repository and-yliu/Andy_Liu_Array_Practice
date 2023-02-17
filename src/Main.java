import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[20];
        int count = 0;
        for(int i = 0; i < 20; i++){
            a[i] = (int)(Math.random() * 6 + 1);
            if (a[i] == 1){
                count++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(count);

        int[] b = new int[10];
        int total = 0;
        for(int i = 0; i < 10; i++){
            b[i] = (int)(Math.random() * 100 + 1);
            total = total + b[i];
        }
        int avg = total/10;
        System.out.println(Arrays.toString(b));
        System.out.println(avg);

        int storage = b[0];
        b[0] = b[9];
        b[9] = storage;
        System.out.println(Arrays.toString(b));

        int[] d = new int[10];
        int j = 10;
        for(int i = 0; i < 10; i++){
            d[j-1] = b[i];
            j = j -1;
        }
        System.out.println(Arrays.toString(d));
    }
}