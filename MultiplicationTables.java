public class MultiplicationTables {
    public static void main(String[] args) {
        for (int num = 3; num <= 8; num++) {
            System.out.println("Multiplication Table of " + num);
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d = %d%n", num, i, num * i);
            }
            System.out.println(); // Blank line for better readability
        }
    }
}

