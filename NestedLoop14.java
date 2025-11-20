import java.util.Scanner;

public class NestedLoop14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        System.out.println("=== Temperature Data Output ===");
        int cityIndex = 0;

        for (double[] cityTemps : temps) {
            System.out.println("City: " + cityIndex);
            for (double temp : cityTemps) {
                System.out.println(temp + " ");
            }
            System.out.println();
            cityIndex++;
        }

        scanner.close();
    }
}
