import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] c = {2,3,4,5};
        a[1] = 45;
        System.out.println(c.length);
        System.out.println(Array.get(a,1));
        Array.set(a,0,80);
        Arrays.sort(a);

    }
}


