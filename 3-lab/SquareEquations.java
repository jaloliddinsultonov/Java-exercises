
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SquareEquations {
    public static void main(String[] args) throws IOException {
        double a, b, c, delta, x1, x2;
        char rootsNumber = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The progrma will calculate the roots of the equation ax^2+bx+c=0");
        System.out.println("a=");
        a = Double.parseDouble(br.readLine());

        if (a == 0){
            System.out.println("Illegal value of the coefficient a");
        } else {
            System.out.println("b=");
            b = Double.parseDouble(br.readLine());
            System.out.println("c=");
            c = Double.parseDouble(br.readLine());

            delta = pow(b, 2) - 4 * a * c;
            if(delta < 0) rootsNumber = 1;
            if(delta == 0) rootsNumber = 2;
            if(delta > 0) rootsNumber = 3;

            switch (rootsNumber) {
                case 1:
                    System.out.println("No roots");
                    break;
                case 2:
                    x1 = (-b)/(2 * a);
                    System.out.printf("There is one root, x1 = x2 = " + x1);
                    break;
                case 3:
                    x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                    x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                    System.out.printf("x1 = " + x1);
                    System.out.printf("\nx2 = " + x2);
                    break;
                default:
                    System.out.printf(":)");
            }

        }
    }
}
