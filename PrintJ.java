public class PrintJ {
    public static void main(String[] args){
        int n = 5; // Size of the letter

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || (j == n / 2 && i != n - 1) || (i == n - 1 && j <= n / 2) || (i == n - 2 && j == 0)) {
                    System.out.print("* "); // Top row, middle vertical, bottom curve, and bottom-left corner
                } else {
                    System.out.print("  "); // Space
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
