import java.util.Random;

public class FillingAnArray {

    public static void main(String[] args) {
        Random randomNumGenerator = new Random();
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = randomNumGenerator.nextInt(100);
        }

        System.out.println();
        for (int y : a) {
            System.out.println("array[" + y + "] = " + a[y]);
        }


    }
}
