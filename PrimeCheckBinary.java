import java.util.Scanner;

public class PrimeCheckBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number in binary (between 1 and 100): ");
        String binaryInput = scanner.nextLine();
        
        int num = Integer.parseInt(binaryInput, 2);

        if (num < 1 || num > 100) {
            System.out.println("Please enter a number between 1 and 100.");
        } else {
            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
