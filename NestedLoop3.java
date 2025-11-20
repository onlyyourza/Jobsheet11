public class NestedLoop3 {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 5) {
            int sum = 0;
            int i = 1;

            String details = "";
            while (i <= n) {
                int square = i * i;
                sum += square;
                details += square;

                if (i < n) {
                    details += " + ";
                }
                i++;
            }
            System.out.println("n = " + n + " → sum of squares = " + details + " = " + sum);
            n++;
        }
    }
}