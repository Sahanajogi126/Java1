public class PrintE {
    public static void main(String[] args){
        int n = 5; // Size of the letter

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || i == n - 1 || i == n / 2) {
                    System.out.print("* "); // Top, middle, and bottom horizontal lines
                } else if (j == 0) {
                    System.out.print("* "); // Left vertical line
                } else {
                    System.out.print("  "); // Space
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
