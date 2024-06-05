import java.util.Scanner;
import java.lang.Math;
public class RectangleInfo {
    public static void main(String[] args) {
        double length = 0;
        double width = 0;
        double area = 0;
        double diagonal = 0;
        double perimeter = 0;
        boolean lengthBoolean = false;
        boolean widthBoolean = false;
        Scanner in3 = new Scanner(System.in);
        do {
            System.out.println("What is your length?");
            if (in3.hasNextDouble()) {
                length = in3.nextDouble();
                if (length > 0){
                    lengthBoolean = true;
                    in3.nextLine();
                }
                else {
                    System.out.println("Invalid input!");
                    in3.nextLine();
                }
            }
            else {
                System.out.println("Invalid input!");
                in3.nextLine();
            }
        } while (!lengthBoolean);
        do {
            System.out.println("What is your width?");
            if (in3.hasNextDouble()) {
                width = in3.nextDouble();
                if (width > 0){
                    widthBoolean = true;
                    in3.nextLine();
                }
                else {
                    System.out.println("Invalid input!");
                    in3.nextLine();
                }
            }
            else {
                System.out.println("Invalid input!");
                in3.nextLine();
            }
        } while (!widthBoolean);
        area = length * width;
        perimeter = 2 * (length + width);
        diagonal = Math.sqrt(length * length + width * width);
        System.out.println("Your area is " + area);
        System.out.println("Your perimeter is " + perimeter);
        System.out.println("Your diagonal is around " + diagonal);
    }
}
