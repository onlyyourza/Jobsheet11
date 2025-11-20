public class NestedLoop2 {
    public static void main(String[] args) {
        char ch = 'a';
        int count = 1;

        while (ch <= 'y') {
            int i = 0;

            while (i < count && ch <= 'y') {
                System.out.print(ch);
                ch++;
                i++;
            }

            System.out.println();
            count = count + 2;
        }
    }
}
