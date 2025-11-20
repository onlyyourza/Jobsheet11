import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'Y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.println("Guess the number (1-10): ");
                int answer = input.nextInt();
                success = (answer == number);
            } while (!success);
            System.out.println("Do you want to repeat the game? (Y/N): ");
            System.out.println("correct number is: " + number);
            menu = input.next().charAt(0);
            input.nextLine();
        } while (menu == 'Y' || menu == 'y');
        input.close();
    }
}

