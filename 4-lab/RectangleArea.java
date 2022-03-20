import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleArea {
    float width, length, area;

    public void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Length:");
        length = Float.parseFloat(br.readLine());
        System.out.println("Width:");
        width = Float.parseFloat(br.readLine());
    }

    public void computeField() {
        area = length * width;
    }

    public void fieldDisplay() {
        System.out.println("The area of rectangle is: " + area);
    }
}






