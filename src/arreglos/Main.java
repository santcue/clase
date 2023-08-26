package arreglos;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Isabella", "Juanita", "Carlos"};
        int[] numbers = {2,3,5};
        float[] floats = new float[5];
        System.out.println(numbers.length);
        floats[0] = 1.5f;
        floats[1] = 45.8f;
        Array.set(floats,2,34.5f);
        System.out.println(floats[1]);
        System.out.println(Array.get(floats,1));
        for (float i: floats) {
            System.out.println(i);
        }
    }
}


