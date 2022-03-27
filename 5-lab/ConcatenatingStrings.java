
import java.util.Scanner;

public class ConcatenatingStrings {
    public static void main(String[] args){
        String word1, word2;
        Scanner s = new Scanner(System.in);

        System.out.println("Put first word: ");
        word1 = s.nextLine();
        System.out.println("Put second word: ");
        word2 = s.nextLine();

        word1 = word1.concat(word2);

        System.out.println("The output is: " + word1);
        System.out.println(word1.compareTo(word2));
        System.out.println(word1.equalsIgnoreCase(word2));

    }
}
