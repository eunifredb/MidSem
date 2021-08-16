
package midsem;
import java.util.Random;

public class MidSemAns {
    public static void main(String[] args) {
        int[] array = { 3, 7, 1, 8, 5, 19, 4, 2, 0, 1 };
           removeelmts(array);
    }
    static void removeelmts(int[] array) {
        Random r = new Random();
        while (array.length > 0) {
        int index = r.nextInt(array.length);
        System.out.println("index = " + index + ", element = " + array[index]);
        int[] arr = new int[array.length - 1];
        for (int i = 0; i < index; i++)
        arr[i] = array[i];
        for (int i = index; i < array.length - 1; i++)
        arr[i] = array[i + 1];
        array = arr;
}
}
}
