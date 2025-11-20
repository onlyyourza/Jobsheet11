import java.util.Scanner;

public class NestedLoop14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        System.out.println("=== Temperature Data and Averages ===");

        for (int i = 0; i < temps.length; i++) {
            double sum = 0;

            System.out.println("City: " + i);

            for (int j = 0; j < temps[i].length; j++) {
                System.out.println("Day " + (j + 1) + ": " + temps[i][j]);
                sum += temps[i][j];
            }

            double average = sum / temps[i].length;
            System.out.println("Average Temperature for City " + i + ": " + average);
            System.out.println();
        }

        scanner.close();
    }
}
