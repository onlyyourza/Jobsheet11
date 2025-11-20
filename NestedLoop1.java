public class NestedLoop1 {
    public static void main(String[] args) {

        int i = 10;

        while (i > 1) {
            int j = 1;

            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
