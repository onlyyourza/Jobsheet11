import java.util.Arrays;
import java.util.Scanner;

public class PolinemaAthletes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};

        String[][] athletes = new String[4][5];

        for (int i = 0; i < athletes.length; i++) {
            System.out.println("Enter 5 athlete names for " + sports[i] + ":");
            for (int j = 0; j < athletes[i].length; j++) {
                System.out.print("Athlete " + (j + 1) + ": ");
                athletes[i][j] = sc.nextLine();
            }
            System.out.println();
        }

        for (int i = 0; i < athletes.length; i++) {
            Arrays.sort(athletes[i]);
        }

        System.out.println("\n=== Sorted Athlete List (Ascending) ===");

        for (int i = 0; i < athletes.length; i++) {
            System.out.println(sports[i] + ": ");
            for (int j = 0; j < athletes[i].length; j++) {
                System.out.println(" - " + athletes[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
