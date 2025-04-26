public class SecondMin {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 1, 3, 7};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second minimum element");
        } else {
            System.out.println("Second minimum is: " + secondMin);
        }
    }
}
