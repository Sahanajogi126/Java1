public class PrintG {
    public static void main(String[] args){
        int n = 5; // Size of the letter

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || i == n - 1) {
                    System.out.print("* "); // Top and bottom horizontal lines
                } else if (j == 0) {
                    System.out.print("* "); // Left vertical line
                } else if (i == n / 2 && j >= n / 2) {
                    System.out.print("* "); // Middle horizontal line (only on the right side)
                } else if (j == n - 1 && i >= n / 2) {
                    System.out.print("* "); // Right vertical line (lower half)
                } else {
                    System.out.print("  "); // Space
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
