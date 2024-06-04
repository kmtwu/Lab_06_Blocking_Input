import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cValue;
        double fValue;
        boolean input = false;
        do {
            System.out.println("What is your C value?");
            if (in.hasNextDouble()){
                cValue = in.nextDouble();
                in.nextLine();
                input = true;
                fValue = (cValue * 9 / 5) + 32;
                System.out.println("Your converted F value is " + fValue + ".");
            }
            else {
                System.out.println("Your input is not valid!");
                in.nextLine();
            }
        } while (!input);
    }
}