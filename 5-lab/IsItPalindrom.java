import java.util.Scanner;

public class IsItPalindrom {
    public static void main(String[] args){

        System.out.print("Put string:");
        Scanner ss = new Scanner(System.in);

        String rString  = ss.nextLine();
        int length = rString.length();
        rString = rString.toLowerCase();

        boolean iPal = true;
        for(int bIndex = 0; bIndex < length; bIndex++){
            if(rString.charAt(bIndex) != rString.charAt(length - 1 - bIndex)){
                System.out.println("String is not Palindrom");
                iPal = false;
                break;
            }
        }
        if(iPal){
            System.out.println("String is Palindrom");
        }
    }
}
