import java.awt.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner in4 = new Scanner(System.in);
        int val = generator.nextInt(10) + 1;
        int input = -1;
        String YorN;
        boolean more = true;
        do {
            System.out.println("Guess the number from 1 - 10:");
            input = in4.nextInt();
            if (input > val) {
                System.out.println("Your guess was higher!");
                System.out.println("My number was " + val);
                val = generator.nextInt(10) + 1;
                in4.nextLine();
                System.out.println("Would you like to play again? Y/N");
                YorN = in4.nextLine();
                if (YorN.equals("Y")) {
                    more = true;
                }
                else if (YorN.equals("N")) {
                    more = false;
                }
            }
            else if (input < val) {
                System.out.println("Your guess was lower!");
                System.out.println("My number was " + val);
                val = generator.nextInt(10) + 1;
                in4.nextLine();
                System.out.println("Would you like to play again? Y/N");
                YorN = in4.nextLine();
                if (YorN.equals("Y")) {
                    more = true;
                }
                else if (YorN.equals("N")) {
                    more = false;
                }
            }
            else {
                System.out.println("You got my number!");
                System.out.println("My number was " + val);
                val = generator.nextInt(10) + 1;
                in4.nextLine();
                System.out.println("Would you like to play again? Y/N");
                YorN = in4.nextLine();
                if (YorN.equals("Y")) {
                    more = true;
                }
                else if (YorN.equals("N")) {
                    more = false;
                }
            }
        } while (more);
    }
}
