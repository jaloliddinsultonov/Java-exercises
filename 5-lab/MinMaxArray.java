import java.util.Random;

public class MinMaxArray {

    public static void main(String[] args)
    {
        int a, max = 0, min = 100;
        int b[] = new int[10];
        Random r = new Random();
        for (int i = 0; i < b.length; i++)
        {
            a = ((r.nextInt(100) + 1));
            b[i] = a;
            System.out.println(b[i] + ", ");
            if (a < min){
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }
        System.out.println("The smallest: " + min);
        System.out.println("The greatest: " + max);
    }
}
