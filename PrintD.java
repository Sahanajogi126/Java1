public class PrintD {
    public static void main(String[] args){
        int n = 5; // Size of the letter

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || i == n - 1) {
                    if (j < n - 1) // Avoid printing '*' at the last column for a curved shape
                        System.out.print("* ");
                } else if (j == 0 || j == n - 1) {
                    System.out.print("* "); // Left and right vertical lines
                } else {
                    System.out.print("  "); // Space
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
