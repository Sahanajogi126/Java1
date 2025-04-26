import java.util.Scanner;

public class SegregateZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements (only 0's and 1's):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0, right = n - 1;

        while (left < right) {
            while (arr[left] == 0 && left < right) left++;
            while (arr[right] == 1 && left < right) right--;
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Array after segregation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
