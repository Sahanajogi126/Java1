public class PrintV {
    public static void main(String[] args) {
        int n = 5; // Size of the letter (should be odd for symmetry)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i < n - 1) || (j == n - 1 && i < n - 1) || (i == n - 1 && j == n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
