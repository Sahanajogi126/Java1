public class PrintB {
    public static void main(String[] args){
        int n = 5; // Size of the letter

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || i == n - 1 || i == n / 2) {
                    System.out.print("* "); 
                } else if (j == 0 || (j == n - 1 && i != 0 && i != n - 1 && i != n / 2)) {
                    System.out.print("* "); 
                } else if (i == j || i + j == n - 1) {
                    System.out.print("+ "); 
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}
