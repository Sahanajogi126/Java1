public class PrintN {
    public static void main(String[] args) {
        int n = 5; // Size of the letter

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
